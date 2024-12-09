package com.dictionaryapp.model.entity.dtos;

import com.dictionaryapp.model.entity.enums.LanguageName;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class AddWordDTO {
    @NotBlank(message = "Term is required.")
    @Size(min = 2, max = 40, message = "Term length must be between 2 and 40 characters.")
    private String term;

    @NotBlank(message = "Translation is required.")
    @Size(min = 2, max = 80, message = "Translation length must be between 2 and 80 characters.")
    private String translation;

    @Size(min = 2, max = 200, message = "Example length must be between 2 and 200 characters.")
    private String example;

    @PastOrPresent(message = "Input date must be in the past or present.")
    private LocalDate inputDate;

    @NotNull(message = "You must select a language")
    private LanguageName language;

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public LocalDate getInputDate() {
        return inputDate;
    }

    public void setInputDate(LocalDate inputDate) {
        this.inputDate = inputDate;
    }


    public void setLanguage(LanguageName language) {
        this.language = language;
    }

    public LanguageName getLanguage() {

        return language;
    }
}
