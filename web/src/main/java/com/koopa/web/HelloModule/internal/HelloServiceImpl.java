package com.koopa.web.HelloModule.internal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    @Qualifier("helloRepositoryImpl")
    private HelloRepository helloRepository;

    @Autowired
    @Qualifier("helloMapperImpl")
    private HelloMapper helloMapper;
}
