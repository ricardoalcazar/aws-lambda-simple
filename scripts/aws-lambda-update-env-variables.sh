#!/bin/bash
# A simple shell script to update the lambda version
# Author: R. Alcazar
# Modified: 6/21/2021

# modify
echo "Running some shit."
aws lambda update-function-configuration --function-name chamberlain-lambda-simple-logger --description changed-var --environment '{"Variables":{"KeyName1":"string","KeyName2":"string"}}'
  
 
# create a new lambda function version
aws lambda publish-version --function-name chamberlain-lambda-simple-logger