package com.accenture.accenture.Ping;

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

    @GetMapping
    public String ping2(){
        return "pong2";
    }
}
