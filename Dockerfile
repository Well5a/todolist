FROM openjdk:11
VOLUME /tmp
COPY build/libs/todo-5.0.0.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]