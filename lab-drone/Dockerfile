# Docker image for springboot file run
# VERSION 1.0
# Author: Xiang
# 基础镜像使用java
FROM openjdk:8-jdk-alpine
ADD drone.jar app.jar
EXPOSE 6003
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
