package com.spring.demo.SpringDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {


    @RequestMapping("/")
    public String index(){
        return "Hello World!";
    }

    @RequestMapping("/users")
    public String getUsers(){
        return "<h1>Test</h1>\n<button>Click here</button>";
    }
}
