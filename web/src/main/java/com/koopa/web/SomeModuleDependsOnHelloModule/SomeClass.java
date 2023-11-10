package com.koopa.web.SomeModuleDependsOnHelloModule;

import com.koopa.web.HelloModule.HelloExternalAPI;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SomeClass {

    private String test;

    public SomeClass(@Qualifier("helloController") HelloExternalAPI api) {
        test = "" + api.getClass();
    }

    @GetMapping(value = "/test")
    public Mono<String> hello() {
        return Mono.just(test);
    }
}
