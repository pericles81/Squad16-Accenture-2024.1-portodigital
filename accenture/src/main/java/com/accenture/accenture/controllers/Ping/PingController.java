package com.accenture.accenture.controllers.Ping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "ping")
public class PingController {
    
    @GetMapping
    public String ping(){
        return "pong";
    }
}
