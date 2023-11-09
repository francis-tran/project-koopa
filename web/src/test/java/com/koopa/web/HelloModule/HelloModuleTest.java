package com.koopa.web.HelloModule;

import com.koopa.web.WebApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.modulith.core.ApplicationModules;

class HelloModuleTest {

    private static final Class<WebApplication> webApp = WebApplication.class;
    private static final ApplicationModules modules = ApplicationModules.of(
        webApp
    );
    private static final Logger logger = LoggerFactory.getLogger(
        HelloModuleTest.class
    );

    @Test
    void createApplicationModuleModel() {
        modules.forEach(System.out::println);
        logger.info("TESTING 123 HELLO");
        TestReporter testReporter = new TestReporter();
    }

    @Test
    void verifiesModularStructure() {
        modules.verify();
    }
}
