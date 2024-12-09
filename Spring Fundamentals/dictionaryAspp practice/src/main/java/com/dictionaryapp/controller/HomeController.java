package com.dictionaryapp.controller;

import ch.qos.logback.core.model.Model;
import com.dictionaryapp.config.UserSession;
import com.dictionaryapp.service.UserService;
import com.dictionaryapp.service.WordService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final UserSession userSession;
    private final WordService wordService;

    private final UserService userService;

    public HomeController(UserSession userSession, WordService wordService, UserService userService) {
        this.userSession = userSession;
        this.wordService = wordService;
        this.userService = userService;
    }


    @GetMapping("/")
    public String nonLoggedIndex() {
        if (userSession.isLoggedIn()) {
            return "redirect:/home";
        }

        return "index";
    }

    @GetMapping("/home")
    public String loggedInIndex(Model model) {
        if (!userSession.isLoggedIn()) {
            return "redirect:/";


        }
        return "home";

    }
}

