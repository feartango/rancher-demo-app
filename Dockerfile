FROM openjdk:8-jdk-alpine

ARG VER

ENV VER ${VER:-UNKNOW}

ENV TZ=Asia/Shanghai

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

ADD target/demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dversion=${VER}","-jar","/app.jar"]