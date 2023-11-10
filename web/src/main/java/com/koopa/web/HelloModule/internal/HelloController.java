package com.koopa.web.HelloModule.internal;

import com.koopa.web.HelloModule.HelloExternalAPI;
import com.koopa.web.HelloModule.HelloInternalAPI;
import com.koopa.web.HelloModule.internal.models.HelloBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.spring6.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring6.context.webflux.ReactiveDataDriverContextVariable;
import reactor.core.publisher.Mono;

@Controller
public class HelloController implements HelloInternalAPI, HelloExternalAPI {

    @Autowired
    private HelloRepository helloRepository = new HelloRepository();

    // We expose HelloExternalAPI's methods such as this one
    @GetMapping(value = "/hello")
    public Mono<HelloBean> hello() {
        return Mono.just(new HelloBean("Hello World!"));
    }

    // This was placed here temporarily. When this is removed, change @Controller to @RestController
    // @Controller is needed to render the view (View is found in resources/templates/index.html)
    @GetMapping(value = "/")
    public String index(final Model model) {
        IReactiveDataDriverContextVariable reactiveDataDrivenMode =
            new ReactiveDataDriverContextVariable(helloRepository.findAll(), 1);
        model.addAttribute("messages", reactiveDataDrivenMode);
        return "index"; // It looks like we are returning string but ThymeLeaf dependency package will recognize it and do its thing
    }
}
