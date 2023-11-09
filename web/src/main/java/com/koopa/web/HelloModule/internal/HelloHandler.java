package com.koopa.web.HelloModule.internal;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HelloHandler {

    public Mono<ServerResponse> index(ServerRequest request) {
        return ServerResponse
            .ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(BodyInserters.fromValue(new HelloBean("Hello World!")));
    }
}
