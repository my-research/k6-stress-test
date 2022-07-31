package com.wonit.restapiserver;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class CreateUserController {

    private final UserRepository repository;

    @GetMapping("/users")
    public ResponseEntity<User> createUser() {
        User savedUser = repository.save(User.newInstance());
        return ResponseEntity.ok(savedUser);
    }
}
