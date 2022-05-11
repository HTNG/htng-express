FROM openjdk:8-jre-slim
VOLUME /tmp
ARG JAR_FILE
RUN echo "Add ${JAR_FILE} to app.jar"
ADD ${JAR_FILE} app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar