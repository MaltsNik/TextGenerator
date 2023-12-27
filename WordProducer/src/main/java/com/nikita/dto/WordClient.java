package com.nikita.dto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "WordProducer")
public interface WordClient {
    @PostMapping(path ="/api/v1/words")
   public Word getWord();
}
