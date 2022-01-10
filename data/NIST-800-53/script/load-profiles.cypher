// 1. Import HIGH profile


WITH "https://raw.githubusercontent.com/usnistgov/oscal-content/master/nist.gov/SP800-53/rev5/json/NIST_SP-800-53_rev5_HIGH-baseline_profile.json" AS url
CALL apoc.load.json(url, '$.profile') YIELD value
UNWIND value AS profile

MERGE (p:Profile{name:"HIGH"})
SET p.title = profile.metadata.title
SET p.oscalVersion = profile.metadata.`oscal-version` 
SET p.uuid = profile.uuid
SET p.layer = 'Profile'
WITH p, profile

UNWIND profile.imports[0].`include-controls`[0].`with-ids` AS control
MATCH (c1:rev5Control {id: control})
MERGE (p)-[:INCLUDES_CONTROL]->(c1);


// 2. Import MODERATE profile

WITH "https://raw.githubusercontent.com/usnistgov/oscal-content/master/nist.gov/SP800-53/rev5/json/NIST_SP-800-53_rev5_MODERATE-baseline_profile.json" AS url
CALL apoc.load.json(url, '$.profile') YIELD value
UNWIND value AS profile

MERGE (p:Profile{name:"MODERATE"})
SET p.title = profile.metadata.title
SET p.oscalVersion = profile.metadata.`oscal-version` 
SET p.uuid = profile.uuid
SET p.layer = 'Profile'
WITH p, profile

UNWIND profile.imports[0].`include-controls`[0].`with-ids` AS control
MATCH (c1:rev5Control {id: control})
MERGE (p)-[:INCLUDES_CONTROL]->(c1);


// 3. Import LOW profile

WITH "https://raw.githubusercontent.com/usnistgov/oscal-content/master/nist.gov/SP800-53/rev5/json/NIST_SP-800-53_rev5_LOW-baseline_profile.json" AS url
CALL apoc.load.json(url, '$.profile') YIELD value
UNWIND value AS profile

MERGE (p:Profile{name:"LOW"})
SET p.title = profile.metadata.title
SET p.oscalVersion = profile.metadata.`oscal-version` 
SET p.uuid = profile.uuid
SET p.layer = 'Profile'
WITH p, profile

UNWIND profile.imports[0].`include-controls`[0].`with-ids` AS control
MATCH (c1:rev5Control {id: control})
MERGE (p)-[:INCLUDES_CONTROL]->(c1);


// 4. Import PRIVACY profile

WITH "https://raw.githubusercontent.com/usnistgov/oscal-content/master/nist.gov/SP800-53/rev5/json/NIST_SP-800-53_rev5_PRIVACY-baseline_profile.json" AS url
CALL apoc.load.json(url, '$.profile') YIELD value
UNWIND value AS profile

MERGE (p:Profile{name:"PRIVACY"})
SET p.title = profile.metadata.title
SET p.oscalVersion = profile.metadata.`oscal-version` 
SET p.uuid = profile.uuid
SET p.layer = 'Profile'
WITH p, profile

UNWIND profile.imports[0].`include-controls`[0].`with-ids` AS control
MATCH (c1:rev5Control {id: control})
MERGE (p)-[:INCLUDES_CONTROL]->(c1);


