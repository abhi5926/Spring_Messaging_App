package com.example.SpringMessagingApp.controller;
import com.example.SpringMessagingApp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    // UC1
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From BridgeLabz!!!";
    }
}

