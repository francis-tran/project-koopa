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
// Note: There can be multiple DTOs. It just happens that the HelloBean has one field so only one DTO was created.
public class HelloBeanDTO {

    private String message;
}
