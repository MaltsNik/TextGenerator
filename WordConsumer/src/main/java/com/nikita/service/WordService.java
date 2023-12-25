package com.nikita.service;

import com.nikita.repository.WordRepository;
import com.nikita.repository.entity.Word;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class WordService {
    private final WordRepository wordRepository;

    public WordService(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @Transactional
    @KafkaListener(topics = ("${application.kafka.topic}"), groupId = ("$application.spring.kafka.consumer.group-id"))
    public void saveWord(Word word) {
        word.setReceivedDate(LocalDateTime.now());
        wordRepository.save(word);
    }
}
