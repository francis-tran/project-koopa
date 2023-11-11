package com.koopa.web.HelloModule.internal.models;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface HelloBeanDAO {
    boolean add(HelloBean o);

    Mono<HelloBean> getById(long id);

    Flux<HelloBean> getAll();

    boolean update(HelloBean o);

    boolean delete(HelloBean o);
}
