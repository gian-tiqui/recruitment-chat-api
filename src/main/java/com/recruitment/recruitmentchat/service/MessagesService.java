package com.recruitment.recruitmentchat.service;

import com.recruitment.recruitmentchat.dto.MessageDto;

import java.util.List;

public interface MessagesService {
    List<MessageDto> getMessages();
    List<MessageDto> getMessagesById(Long userId);
    MessageDto createMessage(MessageDto messageDto);
    MessageDto editMessage(Long id, MessageDto messageDto);
    void deleteMessage(Long id);
}
