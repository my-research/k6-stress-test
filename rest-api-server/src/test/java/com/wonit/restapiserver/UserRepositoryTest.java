package com.wonit.restapiserver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Test
    void name() {
        User user = User.newInstance();
        User save = repository.save(user);

        System.out.println("save = " + save);
    }
}