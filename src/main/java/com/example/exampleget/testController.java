package com.example.exampleget;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping("/first")
    public String pring(){

        return "Hello, this is my first spring boot application";
    }
}
