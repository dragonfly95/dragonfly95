

docker run -p 5000:5000 -t springio/gs-spring-boot-docker .

docker run -t springio/gs-spring-boot-docker . 


Dockerfile
---
FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/dragonfly95-0.0.1-SNAPSHOT.war
ADD ${JAR_FILE} app.war

EXPOSE 5000
ENTRYPOINT ["java","-jar","/app.war"]




eb init --interactive
eb create graphwork2
eb deploy

eb open
aws elasticbeanstalk terminate-environment --environment-name dragonfly952
aws elasticbeanstalk terminate-environment --environment-name Graphworksproductionenv-env

eb profile --profile graphworks

aws configure list
