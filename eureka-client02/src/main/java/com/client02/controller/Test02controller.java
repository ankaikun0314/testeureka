package com.client02.controller;

import com.client02.api.Test01Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test02controller {

    @Autowired
    private Test01Api test01Api;


     @RequestMapping("test02")
    public  String testClient02(){

         String s = test01Api.test01();
         return  s;
     }
}
