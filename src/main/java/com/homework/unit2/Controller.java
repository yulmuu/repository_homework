package com.homework.unit2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping

    public String helloWorld(){
        return "To-do Application !";
    }
}
