package com.koopa.web.HelloModule;

import com.koopa.web.HelloModule.internal.models.HelloBean;
import reactor.core.publisher.Mono;

// Notice no @Service annotation here because it is an interface
public interface HelloExternalAPI {
    Mono<HelloBean> hello();
}
