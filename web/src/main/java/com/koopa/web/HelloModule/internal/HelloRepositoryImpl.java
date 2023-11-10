package com.koopa.web.HelloModule.internal;

import com.koopa.web.HelloModule.internal.models.HelloBeanDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

// This class is responsible for communicating with the database via SQL query or ORM
@Repository("HelloRepositoryImpl")
public class HelloRepositoryImpl implements HelloRepository {

    @Autowired
    @Qualifier("HelloBeanDAOImpl")
    private HelloBeanDAO helloBeanDAO;
}
