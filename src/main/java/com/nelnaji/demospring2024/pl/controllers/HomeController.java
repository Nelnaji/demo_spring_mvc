package com.nelnaji.demospring2024.pl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/") // url
    public String home() {
        return "home"; //  path (depuis template)
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name, Model model) {
        String sentence = "Hello " + name + " !";
        model.addAttribute("sentence", sentence);
        return "hello";
    }



}
