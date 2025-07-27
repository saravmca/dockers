package com.example.rest_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public SystemInfo greeting(@RequestParam(defaultValue = "World") String name) {
        String hostname = "";
        String ipAddress="";
        try {
            InetAddress ip = InetAddress.getLocalHost();
             hostname = ip.getHostName();
             ipAddress =ip.getHostAddress();
            System.out.println("Local IP Address: " + ipAddress);
            System.out.println("Local Hostname: " + hostname);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
       // return new Greeting(counter.incrementAndGet(), String.format(template, name));\
        return new SystemInfo(ipAddress,hostname);
    }
}
