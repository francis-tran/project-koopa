package com.koopa.web.HelloModule.internal;

import com.koopa.web.HelloModule.HelloBeanDTO;
import com.koopa.web.HelloModule.HelloExternalAPI;
import com.koopa.web.HelloModule.HelloInternalAPI;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController implements HelloInternalAPI, HelloExternalAPI {

    private HelloService helloService;

    // We inject the dependency into the constructor
    public HelloController(
        @Qualifier("helloServiceImpl") HelloService helloService
    ) {
        this.helloService = helloService;
    }

    // We expose HelloExternalAPI's methods such as this one
    @GetMapping(value = "/hello")
    public Mono<HelloBeanDTO> hello() {
        return Mono.just(new HelloBeanDTO("Hello World!"));
    }
}
