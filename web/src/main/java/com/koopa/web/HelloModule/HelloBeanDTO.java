package com.koopa.web.HelloModule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
// Note: There can be multiple DTOs. It just happens that the HelloBean has one field so only one DTO was created.
public class HelloBeanDTO {

    private String message;
}
