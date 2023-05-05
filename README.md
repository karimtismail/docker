# Simple-Docker-Project
## Requirements
- Docker
- Docker Compose
## Installation
```
git clone https://github.com/karimtismail/docker.git
cd docker
docker-compose build
docker-compose up
```
## Usage
Once the containers are up and running, you can access the following services:
- Spring Boot server: ```http://localhost:8080```
- RabbitMQ management console: ```http://localhost:15672```
- Client project: ```http://localhost:3000```

## Spring Boot server
The Spring Boot server exposes a REST API with a simple controller that responds to GET requests on the /hello endpoint.

## RabbitMQ
RabbitMQ is used as a message broker for communication between the server and client projects. The management console allows you to monitor the queues and exchanges.

## Client project
The client project is a simple web application that uses the Spring WebClient to send a message to the server and receive a response.
