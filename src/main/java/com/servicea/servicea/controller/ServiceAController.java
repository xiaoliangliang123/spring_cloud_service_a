package com.servicea.servicea.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ServiceAController {

    @RequestMapping("/invoke")
    public String invoke(){
        return "servicea";
    }
}
