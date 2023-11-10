package com.koopa.web.HelloModule.internal;

import com.koopa.web.HelloModule.HelloExternalAPI;
import com.koopa.web.HelloModule.HelloInternalAPI;
import com.koopa.web.HelloModule.internal.models.HelloBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController implements HelloInternalAPI, HelloExternalAPI {

    // We expose HelloExternalAPI's methods such as this one
    @GetMapping(value = "/hello")
    public Mono<HelloBean> hello() {
        return Mono.just(new HelloBean("Hello World!"));
    }
}
