package com.koopa.web.HelloModule.internal;

import com.koopa.web.HelloModule.internal.models.HelloBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

// https://www.baeldung.com/spring-webflux
// https://howtodoinjava.com/spring-webflux/spring-webflux-tutorial/
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public Mono<HelloBean> hello() {
        return Mono.just(new HelloBean("Hello World!"));
    }
}
