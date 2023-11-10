package com.koopa.web.HelloModule.internal;

import com.koopa.web.HelloModule.internal.models.HelloBeanDAO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

// This class is responsible for communicating with the database via SQL query or ORM
@Repository
public class HelloRepositoryImpl implements HelloRepository {

    private HelloBeanDAO helloBeanDAO;

    // We inject the dependency into the constructor
    public HelloRepositoryImpl(
        @Qualifier("helloBeanDAOImpl") HelloBeanDAO helloBeanDAO
    ) {
        this.helloBeanDAO = helloBeanDAO;
    }
}
