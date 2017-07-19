#!/bin/bash

mvn clean install
cp target/first.servlet.war /usr/local/apache-tomcat/webapps/
sh /usr/local/apache-tomcat/bin/shutdown.sh 
sh /usr/local/apache-tomcat/bin/startup.sh 
        

