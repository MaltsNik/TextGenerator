package com.nikita.controller;

import com.nikita.repository.entity.Word;
import com.nikita.service.WordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/words")
public class WordController {
    private static final Logger log = LoggerFactory.getLogger(WordController.class);
    private final WordService wordService;

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @PostMapping
    public ResponseEntity<Word> saveWord(@RequestBody Word word) {
        log.info(word.toString());
        return ResponseEntity.ok(wordService.saveWord(word));
    }
}