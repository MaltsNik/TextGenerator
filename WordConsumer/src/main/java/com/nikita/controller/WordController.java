package com.nikita.controller;

import com.nikita.repository.entity.Word;
import com.nikita.service.WordService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class WordController {
    private final WordService wordService;

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @PostMapping("/words")
    public void saveWord(@RequestBody Word word) {
        wordService.saveWord(word);
    }
}
