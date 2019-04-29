package com.quan.serviceribbon.server;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServer {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${server.port}")
    String port;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiServer(){
        return restTemplate.getForObject("http://HELLO-SERVER/hello",String.class);
    }

    public String hiError(){
        return "error,"+port;
    }
}
