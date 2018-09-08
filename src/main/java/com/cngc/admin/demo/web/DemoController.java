package com.cngc.admin.demo.web;

import com.cngc.admin.demo.client.DemoClient;
import com.cngc.admin.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("a")
public class DemoController {

    @Autowired
    private DemoClient serviceBClient;

    @GetMapping("/users/{id}")
    public User getUsersProxy(@PathVariable String id) {
        return serviceBClient.getUser(id);
    }
}
