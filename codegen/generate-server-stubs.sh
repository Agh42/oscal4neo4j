#!/bin/bash
java -jar ~/bin/swagger-codegen/swagger-codegen-cli.jar generate \
-i ~/git/oscal-rest/openapi.yaml \
-l spring \
-o stubs

