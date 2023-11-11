package com.koopa.web.HelloModule.internal;

import com.koopa.web.HelloModule.HelloBeanDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloControllerGraphQLImpl implements HelloController {

    private HelloService helloService;

    // We inject the dependency into the constructor
    public HelloControllerGraphQLImpl(
        @Qualifier("helloServiceImpl") HelloService helloService
    ) {
        this.helloService = helloService;
    }

    @Override
    @QueryMapping // GraphQL annotation for matching schema query to java code
    public Mono<HelloBeanDTO> getHelloMessage() {
        return Mono.just(new HelloBeanDTO("Hello World!"));
    }
}
