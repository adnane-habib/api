package com.feedback.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/") public String home() { return "index.html"; }
    @GetMapping("/index") public String index() { return "index.html"; }
}
