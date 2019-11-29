package com.client01.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController01 {

    @RequestMapping("test01")
    public  String test01(){

        return "";
    }

}
