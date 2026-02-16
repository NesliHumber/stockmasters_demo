package com.stockmasters.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "dashboard";   // loads dashboard.html
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {

        model.addAttribute("totalProducts", 120);
        model.addAttribute("totalCenters", 3);
        model.addAttribute("lowStock", 8);

        return "dashboard";
    }

    @GetMapping("/products")
    public String products() {
        return "products";
    }

    @GetMapping("/products/new")
    public String createProduct() {
        return "create-product";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/inventory")
    public String inventory() {
        return "inventory";
    }

    @GetMapping("/centers")
        public String centers() {
            return "centers";
        }
    }

