package com.example.APIGateway;

import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name="login",url = "http://172.16.20.82:8083")
public interface APIProxy {


    @GetMapping("/user/me")
    public Object login(@RequestHeader("Authorization") String token);
}
