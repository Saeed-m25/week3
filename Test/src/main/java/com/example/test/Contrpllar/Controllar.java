package com.example.test.Contrpllar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;


@RestController
@RequestMapping("/hello")
public class Controllar {

    @GetMapping("/name")
    public String getName(){
    return"My name is saeed";

    }
@GetMapping("age")
    public String getage(){
        return "My age is 25";
    }
   @GetMapping("/check/status")
    public String getcheck(){
        return "Everything OK";
    }
   @GetMapping("health")
    public String gethealth(){
        return "Server health is up and running";
    }
}
