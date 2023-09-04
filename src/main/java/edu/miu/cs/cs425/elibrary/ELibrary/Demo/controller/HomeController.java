package edu.miu.cs.cs425.elibrary.ELibrary.Demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping(value = {"/" ,"/eRegistrar" ,"/eRegistrar/home"})
    public String displayHomePage(){
        return "home/index";
    }
}
