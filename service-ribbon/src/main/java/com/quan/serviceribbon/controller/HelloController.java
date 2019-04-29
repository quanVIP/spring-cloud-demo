package com.quan.serviceribbon.controller;

import com.quan.serviceribbon.server.HelloServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloServer helloServer;

    @RequestMapping(value = "/hello")
    public String hello(){
        return  helloServer.hiServer();
    }
}
