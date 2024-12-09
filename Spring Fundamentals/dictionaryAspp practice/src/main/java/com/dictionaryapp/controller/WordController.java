package com.dictionaryapp.controller;

import com.dictionaryapp.config.UserSession;
import com.dictionaryapp.model.entity.Language;
import com.dictionaryapp.model.entity.dtos.AddWordDTO;
import com.dictionaryapp.service.LanguageService;
import com.dictionaryapp.service.WordService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class WordController {

    private final WordService wordService;
    private final LanguageService languageService;

    private final UserSession userSession;

    @Autowired
    public WordController(WordService wordService, LanguageService languageService, UserSession userSession) {
        this.wordService = wordService;
        this.languageService = languageService;
        this.userSession = userSession;
    }

    @GetMapping
    public String viewWords(Model model) {
        List<Language> languages = languageService.getAllLanguagesWithWords();
        model.addAttribute("languages", languages);
        model.addAttribute("totalWords", wordService.getTotalWordCount());
        return "home";
    }

    @GetMapping("/word-add")
    public String addWord(Model model) {
        model.addAttribute("wordDTO", new AddWordDTO());
        model.addAttribute("languages", languageService.getAllLanguages());
        return "/word-add";
    }

    @PostMapping("/word-add")
    public String addWord(
            @Valid AddWordDTO data,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes
    ) {
        if (!userSession.isLoggedIn()) {
            return "redirect:/";
        }

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("addWordData", data);
            redirectAttributes.addFlashAttribute(
                    "org.springframework.validation.BindingResult.addWordData", bindingResult);

            return "redirect:/word-add";
        }

        boolean success = wordService.addWord(data);

        if (!success) {
            // show generic error? duplicate name
            redirectAttributes.addFlashAttribute("addWordData", data);

            return "redirect:/word-add";
        }

        return "redirect:/home";
    }

    @GetMapping("/remove/{id}")
    public String removeWord(@PathVariable("id") Long id) {
        wordService.removeWord(id);
        return "redirect:/home";
    }

    @GetMapping("/removeAll")
    public String removeAllWords() {
        wordService.removeAllWords();
        return "redirect:/home";
    }

    @ModelAttribute
    public AddWordDTO addWordDTO() {
        return new AddWordDTO();
    }

}