# Some example queries:

# List controls without Enhancements:
# should return 322 items:
MATCH (c1:rev5Control) 
WHERE not c1:Enhancement
RETURN c1.id, c1.title;

# List enhancements (867), with their controls
# Controls + Enhancements: 1189 total
MATCH (c1:Enhancement)-[:IS_ENHANCEMENT_OF]->(c2)
RETURN c1.id, c1.title, c2.id, c2.title;

# a withdrawn control with "incorporated-into" link 
MATCH (c:rev5Control)-[r:HAS_PROP]->(p:ControlProp{value:'withdrawn'}) 
WHERE c.id = 'sc-12.4'
RETURN c;

# a withdrawn control with "moved-to" link
MATCH (c:rev5Control)-[r:HAS_PROP]->(p:ControlProp{value:'withdrawn'}) 
WHERE c.id = 'at-3.4'
RETURN c;

# find most referenced backmatter:
MATCH (b:Backmatter)<-[r:REFERENCES]-(c) 
RETURN b.title, b.rlinks, count(r) as numReferenced
ORDER by numReferenced DESC
LIMIT 100;

# find controls most referenced by other controls:
MATCH (c1)<-[r:RELATED{type:'related'}]-(c2) 
RETURN c1.id, c1.title, count(r) AS numRequired
ORDER by numRequired DESC
LIMIT 100;

# Lvl 2:
# Returns 1221 controls for the top 1 referenced control
# (alread exceeding the total number of control(enhancements) of 1189
# overall. So due to the high interconnectivity of the controls, after
# only two hops, some controls are already being referenced by every
# other control in the database. These could be viewed as the most
# important controls and indeed these are central important topics. t
# the top is SA-8 "Security and PRivacy Engineering principles". This
# control is referenced by 1221 controls over two hops, follow by other
# important subjects such as AC-3 "Access Enforcement" (919) and AC-17
# ("Remote access").
# On the low end of the list we find controls that are references only
# once or twice - compared to hundreds of even thousands of times for
# the controls mentioned above. As expected, these are specialized
# topics such as PE-15 "Water damage protection" (1 reference even after
# two hops) or SC-50 ("Software-enforced Separation and Policy
# Enforcement"). These controls - even though important - have a narrow
# focus and are therfor not being referenced by many oter controls as
# prerequisites.
MATCH (c1)<-[rx:RELATED*2{type:'related'}]-(c2)
RETURN c1.id, c1.title, COUNT(rx) AS numRequiredLv2
ORDER by numRequiredLv2 DESC
LIMIT 10;

# Lvl 5:
# (runs approx. 8 min., doesn't make much sende anymore because at this
# depth every control is related to every oter control thousands or even
# millions of times)
MATCH (c1)<-[rx:RELATED*5{type:'related'}]-(c2)
RETURN c1.id, c1.title, COUNT(rx) AS numRequiredLv5
ORDER by numRequiredLv5 DESC
LIMIT 10;


# find all enhancements, parts and params for one control:
# (expand ac2.5 to also see working link to ac-11 fro within the prose)
MATCH p=(c:rev5Control)<-[r:IS_ENHANCEMENT_OF*]-(c2:rev5Control)-[:HAS_PART*]->(part)
WHERE c.id='ac-2'
WITH p, c2
MATCH p2=(c2)-[:HAS_PARAM]->(param)
RETURN p,p2 limit 1000;


# same, but also show set-param contraints from profiles:
MATCH p=(c:rev5Control)<-[r:IS_ENHANCEMENT_OF*]-(c2:rev5Control)-[:HAS_PART*]->(part)
WHERE c.id='ac-2'
WITH p, c2
MATCH p2=(c2)-[:HAS_PARAM]->(param)<-[:CONSTRAINS]-(sp:SetParam)
RETURN p,p2,sp limit 1000;


# show profile alterations to controls:
MATCH p=(c:rev5Control)<-[r:IS_ENHANCEMENT_OF*]-(c2:rev5Control)-[:HAS_PART*]->(part)
WHERE c.id='ac-2'
WITH p, c2
MATCH p3=(c2)<-[:ADD_TO]-(a:Addition)
RETURN p,p3 limit 1000;



# list control with enhancements, parts and params for those parts:
MATCH p=(c:rev5Control)<-[r:IS_ENHANCEMENT_OF*]-(e:rev5Control)-[:HAS_PART*]->(part)
WHERE c.id='ac-2'
WITH e, c, part
MATCH p2=(e)-[:HAS_PARAM]->(param)
RETURN c.id, e.id, e.title, part.id, part.prose, param.id, param.label
ORDER BY c.id, e.id, part.id, param.id
LIMIT 1000;

# list controls that are included in HIGH profile but not MODERATE:
MATCH (p:Profile{name:"HIGH"})-[:INCLUDES_CONTROL]->(c)
WHERE NOT (c)<-[:INCLUDES_CONTROL]-(:Profile{name:"MODERATE"})
RETURN p, c;


