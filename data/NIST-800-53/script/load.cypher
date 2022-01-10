# 1. create nodes and relations for groups, controls, params : 
WITH "https://raw.githubusercontent.com/usnistgov/oscal-content/master/nist.gov/SP800-53/rev5/json/NIST_SP-800-53_rev5_catalog.json" AS url
CALL apoc.load.json(url, '$.catalog.groups') YIELD value
UNWIND value AS group

MERGE (g:rev5Group {id: group.id})
SET g.class = group.class
SET g.title = group.title
SET g.layer = 'Catalog'
WITH g, group

UNWIND group.controls AS control
MERGE (c:rev5Control {id: control.id})
SET c.title = control.title
SET c.class = control.class
SET c.layer = 'Catalog'
MERGE (c)-[:IN_GROUP]->(g)

FOREACH ( param in control.params |
MERGE (c)-[:HAS_PARAM]->(p:ControlParam {id:param.id})
SET p.label = param.label
SET p.select_howmany = param.select.`how-many`
SET p.select_choice = param.select.choice
SET p.layer = 'Catalog'
)

FOREACH ( prop IN control.props |
MERGE (c) -[:HAS_PROP]->(pro:ControlProp {name:prop.name})
SET pro.value = prop.value
)

WITH c, control
UNWIND control.controls AS enhancement
MERGE (e:Enhancement:rev5Control {id: enhancement.id})
SET e.title = enhancement.title
SET e.class = enhancement.class
SET e.layer = 'Catalog'
MERGE (e)-[:IS_ENHANCEMENT_OF]->(c)

FOREACH ( param in enhancement.params |
MERGE (e)-[:HAS_PARAM]->(p:ControlParam {id:param.id})
SET p.label = param.label
SET p.select_howmany = param.select.`how-many`
SET p.select_choice = param.select.choice
SET p.layer = 'Catalog'
)

FOREACH ( prop IN enhancement.props |
MERGE (e) -[:HAS_PROP]->(pro:ControlProp {name:prop.name})
SET pro.value = prop.value
)

# 1b. Create index on ID
CREATE INDEX c_id_idx IF NOT EXISTS FOR (n:rev5Control) ON (n.id);
CREATE INDEX cparam_id_idx IF NOT EXISTS FOR (n:ControlParam) ON (n.id);
CREATE INDEX cpart_id_idx IF NOT EXISTS FOR (n:ControlPart) ON (n.id);
CREATE INDEX bkmtr_id_idx IF NOT EXISTS FOR (n:Backmatter) ON (n.id);

# 2. create parts with props:
WITH "https://raw.githubusercontent.com/usnistgov/oscal-content/master/nist.gov/SP800-53/rev5/json/NIST_SP-800-53_rev5_catalog.json" AS url
CALL apoc.load.json(url, '$.catalog.groups[*].controls[*]..parts[*] ') YIELD value
UNWIND value AS part

MERGE (pa:ControlPart {id: part.id})
SET pa.name = part.name
SET pa.prose = part.prose
SET pa.layer = 'Catalog'

FOREACH (prop IN part.props | 
MERGE (pa)-[:HAS_LABEL]->(pr:PartLabel {value:prop.value})
SET pr.layer = 'Catalog'
)

# 3. link controls to their parts by id substring:
MATCH (c:rev5Control) 
MATCH (p:ControlPart)
WHERE p.id =~ '^'+c.id+'_.*$'
MERGE (c)-[:HAS_PART]->(p);


# 4. link controls to each other
WITH "https://raw.githubusercontent.com/usnistgov/oscal-content/master/nist.gov/SP800-53/rev5/json/NIST_SP-800-53_rev5_catalog.json" AS url
CALL apoc.load.json(url, '$.catalog.groups') YIELD value
UNWIND value AS group
UNWIND group.controls as control
UNWIND control.links as link

MATCH (c1:rev5Control {id: control.id})
MATCH (c2:rev5Control)
WHERE c2.id = split(link.href,'#')[1]

MERGE (c1)-[r:RELATED]->(c2)
SET r.type = link.rel

WITH control
UNWIND control.controls AS enhancement
UNWIND enhancement.links AS elink

MATCH (e:rev5Control{id: enhancement.id})
MATCH (c3:rev5Control)
WHERE c3.id = split(elink.href,'#')[1]

MERGE (e)-[er:RELATED]->(c3)
SET er.type = elink.rel


# 5. import back-matter
WITH "https://raw.githubusercontent.com/usnistgov/oscal-content/master/nist.gov/SP800-53/rev5/json/NIST_SP-800-53_rev5_catalog.json" AS url
CALL apoc.load.json(url, '$.catalog.back-matter.resources') YIELD value
UNWIND value AS resource

MERGE (b:Backmatter {id: resource.uuid})
SET b.layer = 'Catalog'
SET b.title = resource.title
SET b.citation = resource.citation.text
SET b.href = resource.rlinks[0].href


# 6. link controls to backmatter
WITH "https://raw.githubusercontent.com/usnistgov/oscal-content/master/nist.gov/SP800-53/rev5/json/NIST_SP-800-53_rev5_catalog.json" AS url
CALL apoc.load.json(url, '$.catalog.groups') YIELD value
UNWIND value AS group
UNWIND group.controls as control
UNWIND control.links as link

MATCH (c1:rev5Control {id: control.id})
MATCH (b:Backmatter)
WHERE b.id = split(link.href,'#')[1]

MERGE (c1)-[r:REFERENCES]->(b)

WITH control
UNWIND control.controls AS enhancement
UNWIND enhancement.links AS elink

MATCH (e:rev5Control{id: enhancement.id})
MATCH (b2:Backmatter)
WHERE b2.id = split(elink.href,'#')[1]

MERGE (e)-[er:REFERENCES]->(b2)



#  delete all:
# MATCH (n:ControlParam) DETACH DELETE n;
# MATCH (n:ControlProp) DETACH DELETE n;
# MATCH (n:rev5Control) DETACH DELETE n;
# MATCH (n:rev5Group) DETACH DELETE n;


