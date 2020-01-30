FROM openjdk:8-jre-alpine
ENV JAR_FILE demo-0.0.1-SNAPSHOT.jar
ENV GW_HOME /usr/front
EXPOSE 8080
COPY target/$JAR_FILE $GW_HOME/
WORKDIR $GW_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $JAR_FILE"]