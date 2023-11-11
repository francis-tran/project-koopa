package com.koopa.web;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class WebApplicationTests {

    private static final Class<WebApplication> webApp = WebApplication.class;
    private static final ApplicationModules modules = ApplicationModules.of(
        webApp
    );
    private static final Logger logger = LoggerFactory.getLogger(
        WebApplicationTests.class
    );

    @Test
    void createApplicationModuleModel() {
        modules.forEach(x -> logger.info(x.toString()));
    }

    @Test
    void verifiesModularStructure() {
        modules.verify();
    }
}
