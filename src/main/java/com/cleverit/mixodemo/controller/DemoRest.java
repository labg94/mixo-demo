package com.cleverit.mixodemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class DemoRest {


    @GetMapping("{name}")
    public String sayHello(@PathVariable(required = false) String name){
        return "Hello "+ name;
    }


    @GetMapping
    public String sayHello(){
        return "Hello stranger";
    }
}
