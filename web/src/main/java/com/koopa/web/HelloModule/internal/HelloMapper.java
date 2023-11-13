package com.koopa.web.HelloModule.internal;

import com.koopa.web.HelloModule.HelloBeanDTO;
import com.koopa.web.HelloModule.internal.models.HelloBean;
import reactor.core.publisher.Mono;

// Each model class can have one or more DTO's. The mapper is responsible for mapping each DTO class to a model class
// Test comment for merge request
public interface HelloMapper {
    Mono<HelloBean> helloBeanDTOMapToHelloBean(Mono<HelloBeanDTO> obj);

    Mono<HelloBeanDTO> helloBeanMapToHelloBeanDTO(Mono<HelloBean> obj);
}
