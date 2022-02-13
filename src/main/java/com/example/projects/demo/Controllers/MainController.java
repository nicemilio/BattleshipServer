package com.example.projects.demo.Controllers;


import com.example.projects.demo.Services.SetupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    SetupService service;


    @GetMapping(value={"/", "/setup"})
    public String setup(Model model){
        model.addAttribute("name", service.getName());
        return "beliebig/hello";
    }
}
