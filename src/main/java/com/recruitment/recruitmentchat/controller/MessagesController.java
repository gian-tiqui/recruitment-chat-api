package com.recruitment.recruitmentchat.controller;

import com.recruitment.recruitmentchat.dto.MessageDto;
import com.recruitment.recruitmentchat.service.MessagesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/messages")
public class MessagesController {

    MessagesService messagesService;

    @GetMapping
    public ResponseEntity<List<MessageDto>> getMessages() {
        List<MessageDto> messageDtos = messagesService.getMessages();

        return ResponseEntity.ok(messageDtos);
    }


}
