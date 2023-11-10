package com.koopa.web.HelloModule.internal;

import com.koopa.web.HelloModule.internal.models.HelloBean;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

// This class is responsible for communicating with the database via SQL query or ORM
@Repository
public class HelloRepository {

    private static final List<HelloBean> hellos = new ArrayList<>();

    static {
        hellos.add(new HelloBean("IP MAN (2019)"));
        hellos.add(new HelloBean("Iron Man (2008)"));
        hellos.add(new HelloBean("The Shawshank Redemption (1994)"));
        hellos.add(new HelloBean("Forrest Gump (1994)"));
        hellos.add(new HelloBean("Glass (2019)"));
    }

    public Flux<HelloBean> findAll() {
        // Simulate stream data with 250ms delay for demonstration purposes.
        return Flux.fromIterable(hellos).delayElements(Duration.ofMillis(250));
    }
}
