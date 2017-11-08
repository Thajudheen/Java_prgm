#!/usr/bin/env groovy
import groovy.json.JsonSlurper;
node {
    stage 'Prepare Environment'
    env.PATH = "${tool 'maven-3.5.0'}/bin:${env.PATH}"
}

node{
   stage 'Checkout'
   checkout scm
}

node{
   stage 'Package'
   sh "mvn clean package install -Dmaven.test.skip=true"
}