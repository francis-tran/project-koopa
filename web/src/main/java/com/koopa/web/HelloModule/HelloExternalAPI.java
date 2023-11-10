package com.koopa.web.HelloModule;

import reactor.core.publisher.Mono;

// Notice no @Service annotation here because it is an interface
// Anything can communicate with this "External" API via HTTP
public interface HelloExternalAPI {
    Mono<HelloBeanDTO> hello();
}
