package com.koopa.web.HelloModule.internal;

import com.koopa.web.HelloModule.HelloBeanDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloControllerRESTImpl implements HelloController {

    private HelloService helloService;

    // We inject the dependency into the constructor
    public HelloControllerRESTImpl(
        @Qualifier("helloServiceImpl") HelloService helloService
    ) {
        this.helloService = helloService;
    }

    @Override
    // Exposing endpoint
    @GetMapping(value = "/hello")
    public Mono<HelloBeanDTO> getHelloMessage() {
        return Mono.just(new HelloBeanDTO("Hello World!"));
    }
}
