package com.springboot.tutorials.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

@Controller
public class HelloWorldController {

    // show initial HTML form page
    @RequestMapping("/showForm")
    public String showForm() {
        return "form";
    }

    // show initial HTML form page
    @RequestMapping("/showGreetForm")
    public String showGreetForm() {
        return "greetform";
    }

    // process to HTML form data
    @RequestMapping("/processForm")
    public String processForm() {
        return "process";
    }

    @RequestMapping("/processGreetForm")
    public String processGreetProcessForm(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName");
        String greet = (!StringUtils.isEmpty(name)) ? "Good day " + name.toUpperCase() + "!" : "Hello There!!";
        model.addAttribute("message", greet);
        return "greet";
    }

}
