package com.cngc.admin.demo.client;

import com.cngc.admin.demo.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@FeignClient(name = "demo-service-b")
public interface DemoClient {

    @GetMapping("/api/users/{id}")
    User getUser(@PathVariable("id") String id);

    @PostMapping("/api/users")
    User addUser(User user);
}
