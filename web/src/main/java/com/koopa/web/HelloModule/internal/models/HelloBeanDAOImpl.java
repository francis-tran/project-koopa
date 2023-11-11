package com.koopa.web.HelloModule.internal.models;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class HelloBeanDAOImpl implements HelloBeanDAO {

    @Override
    public boolean add(HelloBean o) {
        return true;
    }

    @Override
    public Mono<HelloBean> getById(long id) {
        return Mono.empty();
    }

    @Override
    public Flux<HelloBean> getAll() {
        return Flux.empty();
    }

    @Override
    public boolean update(HelloBean o) {
        return true;
    }

    @Override
    public boolean delete(HelloBean o) {
        return true;
    }
}
