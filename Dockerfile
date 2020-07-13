FROM harbor.msxpert.co.kr/library/openjdk:8-jre-alpine
ENV JAR_FILE hello-0.0.1-SNAPSHOT.jar
ENV APP_HOME /app
EXPOSE 8080
COPY target/$JAR_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -Djava.security.egd=file:/dev/./urandom -jar $JAR_FILE"]