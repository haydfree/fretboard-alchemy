package com.fa.fretboard_alchemy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/index.html")
    public String index() {
        return "index";
    }
}
