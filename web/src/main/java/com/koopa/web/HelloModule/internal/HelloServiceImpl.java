package com.koopa.web.HelloModule.internal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HelloServiceImpl implements HelloService {

    @Autowired
    @Qualifier("HelloRepositoryImpl")
    private HelloRepository helloRepository;

    @Autowired
    @Qualifier("HelloMapperImpl")
    private HelloMapper helloMapper;
}
