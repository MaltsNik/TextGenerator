package com.nikita.client;

import com.nikita.dto.Word;
import com.nikita.service.WordSender;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "word")
public interface WordClient extends WordSender {
    @Override
    @PostMapping(path = "/api/v1/words", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void send(Word word);
}