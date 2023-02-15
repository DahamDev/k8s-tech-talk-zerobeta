FROM dahamne/jre11:1
ARG JAR_FILE=target/test-app-0.0.1.jar
COPY  ${JAR_FILE} /app/test-app-0.0.1.jar
WORKDIR /app
ENTRYPOINT ["java","-jar","test-app-0.0.1.jar"]