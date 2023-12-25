package com.nikita.service;

import org.springframework.stereotype.Service;

@Service
public class WordGenerator implements Generator {
    @Override
    public String textGenerator() {
        int length = (int) Math.random() * 100 + 1;
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = (char) ((int) (Math.random() * 26 + 'a'));
            word.append(c);
        }
        return word.toString();
    }
}
