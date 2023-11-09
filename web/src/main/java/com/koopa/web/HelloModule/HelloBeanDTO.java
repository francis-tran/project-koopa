package com.koopa.web.HelloModule;

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
public class HelloBeanDTO {

    private String message;
}
