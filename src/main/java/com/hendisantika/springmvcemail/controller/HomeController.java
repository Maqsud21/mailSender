package com.hendisantika.springmvcemail.controller;

import com.hendisantika.springmvcemail.dto.Action;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping({"/","/home"})
public class HomeController {
    private static Logger logger = LogManager.getLogger(HomeController.class);

    @GetMapping
    public String showHomePage(Model model) {
        model.addAttribute("action", new Action());
        return "home";
    }
}
