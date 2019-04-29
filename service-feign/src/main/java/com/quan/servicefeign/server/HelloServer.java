package com.quan.servicefeign.server;

import com.quan.servicefeign.fallback.HelloFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "hello-server",fallback = HelloFallback.class)
public interface HelloServer {

    @RequestMapping(value = "/hello")
    String helloServer();
}
