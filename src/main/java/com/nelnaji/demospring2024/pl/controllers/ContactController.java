package com.nelnaji.demospring2024.pl.controllers;


import com.nelnaji.demospring2024.dl.models.Message;
import com.nelnaji.demospring2024.dl.models.MessageForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ContactController {

    List<Message> messages = new ArrayList<>();


    @GetMapping("/contact")
    public String addMessage(Model model) {
        model.addAttribute("message", new MessageForm());
        return "contact";
    }

    @PostMapping("/contact")
    public String postMessage(@ModelAttribute MessageForm message) {
        return "redirect:/confirmation";
    }

}
