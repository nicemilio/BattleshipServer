package com.example.projects.demo.Controllers;


import com.example.projects.demo.Services.SetupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    SetupService setupService;


    @GetMapping(value={"/", "/setup"})
    public String setup(Model model){
        return "index";
    }

    @GetMapping(value={"/solo"})
    public String solo(Model model){
        //setupService.placeShips(true);
        return "beliebig/hello";
    }
}
