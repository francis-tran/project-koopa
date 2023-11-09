package com.koopa.web.HelloModule;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Source: https://spring.io/quickstart
@RestController
public class HelloController {

    @GetMapping("/")
    public String index(
        @RequestParam(value = "name", defaultValue = "World") String name
    ) {
        return String.format("Hello %s!", name);
    }
}
