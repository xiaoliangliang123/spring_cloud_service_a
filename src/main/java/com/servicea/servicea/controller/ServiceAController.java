package com.servicea.servicea.controller;

import com.servicea.servicea.model.DataModel;
import com.servicea.servicea.model.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/")
public class ServiceAController {

    @RequestMapping("/invoke")
    public String invoke(){
        return "servicea";

    }



    @RequestMapping("/invokeAdd")
    public Integer invokeAdd(int a,int b){
        return a+b;
    }
}
