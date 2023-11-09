package com.koopa.web.HelloModule.internal.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Component
public class HelloBean {

    private String message;
}
