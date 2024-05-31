package com.example.lab7_gtics2024_1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value ={"/login"})
    public String registro(){

        return "login";
    }
}
