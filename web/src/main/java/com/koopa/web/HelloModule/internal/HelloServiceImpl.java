package com.koopa.web.HelloModule.internal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    private HelloRepository helloRepository;

    private HelloMapper helloMapper;

    // We inject the dependency into the constructor
    public HelloServiceImpl(
        @Qualifier("helloRepositoryImpl") HelloRepository helloRepository,
        @Qualifier("helloMapperImpl") HelloMapper helloMapper
    ) {
        this.helloRepository = helloRepository;
        this.helloMapper = helloMapper;
    }
}
