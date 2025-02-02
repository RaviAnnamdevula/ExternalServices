package com.jocata.externalservices.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ApplicationController {

//    @GetMapping("/hello")
//    public String hello(){
//        return "Hello";
//    }

    @GetMapping("/hello")
    public String hello(/*@RequestParam String name,*/ /*@PathVariable String name,*/) {
        return "Hello " /*+name*/;
    }

}
