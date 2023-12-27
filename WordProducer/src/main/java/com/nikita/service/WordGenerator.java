package com.nikita.service;

import com.nikita.dto.Word;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class WordGenerator {
    private static final Logger log = LoggerFactory.getLogger(WordGenerator.class);
    private final WordSender sender;

    public WordGenerator(WordSender sender) {
        this.sender = sender;
    }

    @Scheduled(fixedDelay = 3000)
    public void generate() {
        sender.send(textGenerator());
        log.info("generation started");
    }

    public Word textGenerator() {
        Random random = new Random();
        int length = random.nextInt(100 + 1);
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = (char) (random.nextInt(26) + 'a');
            word.append(c);
        }
        return new Word(word.toString());
    }
}

