package com.nelnaji.demospring2024.pl.controllers;

import com.nelnaji.demospring2024.dl.models.Cat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Controller
@RequestMapping("/Cat")
public class CatController {


    private final List<Cat> cats = new ArrayList<>();

    public CatController() {
        cats.add(new Cat(1, "nana", LocalDate.now(), "european short Hair", "Chatte retrouvée petite lorem ispum dolor sit emet consectetur "));
        cats.add(new Cat(2, "neo", LocalDate.now(), "european short Hair ", "grand gourmand protegé vos les aliments qu'il ne doit pas consommer lorem ispum dolor sit emet consectetur" ));
        cats.add(new Cat(3, "miaouette", LocalDate.now(), "Siamese cat", "Chatte vocale, elle ce retrouveras parfaitement dans une maison de chanteur lorem ispum dolor sit emet consectetur"));
        cats.add(new Cat(4, "Riri", LocalDate.now(), "European Long hair", "Riri est la plus filoute de la bande elle deborde d'energie lorem ispum dolor sit emet consectetur"));

    }

    @GetMapping
    public String cat(Model model) {
        model.addAttribute("cats", cats);
        return "index";
    }

    @GetMapping("/{catName}")
    public String getOne(@PathVariable String catName, Model model) {
        try {
            Cat cat = cats.stream().filter(c -> c.catName().equals(catName)).findFirst().orElseThrow();
            model.addAttribute("cat", cat);
            return "detail";
        } catch (NoSuchElementException e) {
            return "error";
        }
    }

}

