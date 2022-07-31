package com.wonit.restapiserver;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TargetController {

    int requestCount = 0;

    @GetMapping("/users")
    public ResponseEntity<List<String>> getUsers() {
        log.info("request detected!! no: {}", requestCount);
        requestCount++;
        List<String> users = List.of("jang", "heo", "kim", "lee", "seo", "ha", "ko");
        return ResponseEntity.ok(users);
    }
}
