package com.nelnaji.demospring2024.pl.controllers;


import com.nelnaji.demospring2024.dl.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class BookController {

    List<Book> books = List.of(
            new Book(1, "Le comte de Monte Cristo"),
            new Book(2, "Les misérables"),
            new Book(3, "Robinso Crusoe"));

    @GetMapping("/book/{id}")
    public String book(@PathVariable long id, Model model) {


        for (Book book : books) {
            if (id == book.getId()) {
                model.addAttribute("book", book);
                return "books/book";
            }
        }
        return "error";
    }

}
