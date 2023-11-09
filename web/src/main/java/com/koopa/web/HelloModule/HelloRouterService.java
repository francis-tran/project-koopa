package com.koopa.web.HelloModule;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

import com.koopa.web.HelloModule.internal.HelloHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

// Source: https://spring.io/guides/gs/reactive-rest-service/
@RestController
@Service
@Configuration(proxyBeanMethods = false)
public class HelloRouterService {

    @Bean
    public RouterFunction<ServerResponse> route(HelloHandler greetingHandler) {
        return RouterFunctions.route(
            GET("/hello").and(accept(MediaType.APPLICATION_JSON)),
            greetingHandler::index
        );
    }
}
