FROM openjdk:11
VOLUME /tmp
COPY build/libs/todo-5.0.0.jar todo-5.0.0.jar
ENTRYPOINT ["java", "-jar", "/todo-5.0.0.jar"]