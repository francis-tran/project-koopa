package com.koopa.web.HelloModule.internal;

import com.koopa.web.HelloModule.HelloBeanDTO;
import com.koopa.web.HelloModule.HelloExternalAPI;
import com.koopa.web.HelloModule.HelloInternalAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController implements HelloInternalAPI, HelloExternalAPI {

    @Autowired
    @Qualifier("helloServiceImpl")
    private HelloService helloService;

    // We expose HelloExternalAPI's methods such as this one
    @GetMapping(value = "/hello")
    public Mono<HelloBeanDTO> hello() {
        return Mono.just(new HelloBeanDTO("Hello World!"));
    }
}
