package com.msita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetingController {

    @RequestMapping(path="/greeting", method= RequestMethod.GET)
    public String greeting(final Model model) {
        model.addAttribute("message", "Hello world");
        return "greeting";
    }
}
