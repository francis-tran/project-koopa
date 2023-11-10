package com.koopa.web.HelloModule.internal;

import com.koopa.web.HelloModule.HelloBeanDTO;
import com.koopa.web.HelloModule.HelloExternalAPI;
import com.koopa.web.HelloModule.HelloInternalAPI;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

public interface HelloController extends HelloInternalAPI, HelloExternalAPI {
    // Exposing endpoint
    @GetMapping(value = "/hello")
    Mono<HelloBeanDTO> hello();
}
