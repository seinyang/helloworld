package com.example.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {


        @GetMapping("/")
        public String hello() {
            return "index";
        }

        @GetMapping("/next")
        public String next() {
            return "next";
        }
    }

