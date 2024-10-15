package com.nelnaji.demospring2024.pl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    @GetMapping("/") // url
    public String home() {
        return "index"; //  path (depuis template)
    }



}
