package com.docker.client;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

public class App {
    public static void main(String[] args) {
            String response = WebClient.builder()
                    .baseUrl("http://" + System.getenv("SERVER_HOST") + ":" + System.getenv("SERVER_PORT"))
                    .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .build()
                    .get()
                    .uri("/hello")
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();
            System.out.println(response);
    }
}
