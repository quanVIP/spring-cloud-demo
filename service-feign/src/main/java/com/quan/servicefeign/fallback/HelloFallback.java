package com.quan.servicefeign.fallback;

import com.quan.servicefeign.server.HelloServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloFallback implements HelloServer {

    @Value("${server.port}")
    String port;

    @Override
    public String helloServer() {
        return "error,"+port;
    }
}
