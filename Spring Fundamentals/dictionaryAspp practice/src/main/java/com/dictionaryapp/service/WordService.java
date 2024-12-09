package com.dictionaryapp.service;

import com.dictionaryapp.config.UserSession;
import com.dictionaryapp.model.entity.Language;
import com.dictionaryapp.model.entity.User;
import com.dictionaryapp.model.entity.Word;
import com.dictionaryapp.model.entity.dtos.AddWordDTO;
import com.dictionaryapp.model.entity.enums.LanguageName;
import com.dictionaryapp.repo.LanguageRepository;
import com.dictionaryapp.repo.UserRepository;
import com.dictionaryapp.repo.WordRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WordService {

    private final WordRepository wordRepository;
    private final LanguageRepository languageRepository;

    private final UserRepository userRepository;

    private final UserSession userSession;

    @Autowired
    public WordService(WordRepository wordRepository, LanguageRepository languageRepository, UserRepository userRepository, UserSession userSession) {
        this.wordRepository = wordRepository;
        this.languageRepository = languageRepository;
        this.userRepository = userRepository;

        this.userSession = userSession;
    }

    public List<Word> getAllWords() {
        return wordRepository.findAll();
    }

    public long getTotalWordCount() {
        return wordRepository.count();
    }


    public boolean addWord(AddWordDTO wordDTO) {
        if (!userSession.isLoggedIn()) {
            return false;
        }

        Language language = languageRepository.findByLanguageName(wordDTO.getLanguage());
        Optional<User> byId = userRepository.findById(userSession.id());

        if (byId.isEmpty()){
            return false;
        }

        Word word = new Word();
        word.setTerm(wordDTO.getTerm());
        word.setTranslation(wordDTO.getTranslation());
        word.setExample(wordDTO.getExample());
        word.setInputDate(wordDTO.getInputDate());
        word.setLanguage(language);
        word.setAddedBy(byId.get());

        wordRepository.save(word);

        return true;
    }

    public List<Word> findSpanish() {
        Optional<User> user = userRepository.findById(userSession.userId());

        if (user.isEmpty()) {
            return new ArrayList<>();
        }

        Language language = languageRepository.findByLanguageName(LanguageName.SPANISH);

        return wordRepository.findByLanguageAndAddedBy(language, user.get());
    }


    @Transactional
    public void removeWord(Long id) {
        wordRepository.deleteById(id);
    }

    @Transactional
    public void removeAllWords() {
        wordRepository.deleteAll();
    }


}