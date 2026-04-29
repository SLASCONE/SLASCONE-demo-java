#!/bin/bash
# Script to build and run the SLASCONE demo application
mvn clean install -q && cd slascone-provisioning-sample && mvn exec:java
