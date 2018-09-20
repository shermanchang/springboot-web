package com.iba.springwebgo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    // search all employee list
    @GetMapping("/emps")
    public String list(){
        // default thymlef will search the folder "calsspath:/templates/xxx.html"
        return "emps/list";
    }
}
