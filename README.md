# todolist
Example project for Spring Boot and Spring Web MVC

## Build the app

```
./gradlew clean build
```

## App usage (mappings)

* localhost:5555/hello for the hello world example found in the [Spring Quickstart Guide](https://spring.io/quickstart)
* localhost:5555/ui for list of todos
* `curl -X POST localhost:5555/task` to add a task to the list
* `curl -X DELETE localhost:5555/id` to delete a task from the list

## Start the app with Docker-Compose

Run `docker-compose up` in root directory to start the app.

This will automatically pull the images from Dockerhub, you can find the todolist app [here](https://hub.docker.com/r/well5a/todolist).
You can also get the image...

* locally: Build the app, then the image with `docker build -t todolist .` in project root directory
* or by pulling it manually from Dockerhub: `docker pull well5a/todolist`
