package com.koopa.web.SomeModuleDependsOnHelloModule;

import com.koopa.web.HelloModule.HelloExternalAPI;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SomeClass {

    private String test;

    private HelloExternalAPI api;

    // We inject the dependency into the constructor
    public SomeClass(@Qualifier("helloController") HelloExternalAPI api) {
        test = "" + api.getClass();
        this.api = api;
    }

    @GetMapping(value = "/test")
    public Mono<String> hello() {
        return Mono.just(test);
    }
}
