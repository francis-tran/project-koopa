package com.koopa.web.HelloModule.internal.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class HelloBean {

    private String message;
}
