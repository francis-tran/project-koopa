package com.koopa.web.HelloModule.internal;

import com.koopa.web.HelloModule.HelloBeanDTO;
import com.koopa.web.HelloModule.internal.models.HelloBean;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component("HelloMapperImpl")
public class HelloMapperImpl implements HelloMapper {

    public Mono<HelloBean> helloBeanDTOMapToHelloBean(Mono<HelloBeanDTO> obj) {
        HelloBean o = new HelloBean(obj.block().getMessage());
        return Mono.just(o);
    }

    public Mono<HelloBeanDTO> helloBeanMapToHelloBeanDTO(Mono<HelloBean> obj) {
        HelloBeanDTO o = new HelloBeanDTO(obj.block().getMessage());
        return Mono.just(o);
    }
}
