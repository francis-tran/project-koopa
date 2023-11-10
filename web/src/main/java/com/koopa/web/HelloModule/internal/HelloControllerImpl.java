package com.koopa.web.HelloModule.internal;

import com.koopa.web.HelloModule.HelloBeanDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloControllerImpl implements HelloController {

    private HelloService helloService;

    // We inject the dependency into the constructor
    public HelloControllerImpl(
        @Qualifier("helloServiceImpl") HelloService helloService
    ) {
        this.helloService = helloService;
    }

    @Override
    public Mono<HelloBeanDTO> hello() {
        return Mono.just(new HelloBeanDTO("Hello World!"));
    }
}
