package com.koopa.web.HelloModule.internal.models;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class HelloBeanDAOImpl implements HelloBeanDAO {

    public boolean add(HelloBean o) {
        return true;
    }

    public Mono<HelloBean> getById(long id) {
        return Mono.empty();
    }

    public Flux<HelloBean> getAll() {
        return Flux.empty();
    }

    public boolean update(HelloBean o) {
        return true;
    }

    public boolean delete(HelloBean o) {
        return true;
    }
}
