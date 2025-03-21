package com.scaler.project1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World !!";
    }
    @RequestMapping("/hello/{name}abc")
    public String hello(@PathVariable ("name") String you){

        return "Hello " + you+"  oki";
    }
    @GetMapping("/hello1")
    public String hello1() {
        return "Hello yourself !!";
    }
}

