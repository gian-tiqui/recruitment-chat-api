package com.recruitment.recruitmentchat.service.impl;

import com.recruitment.recruitmentchat.dto.MessageDto;
import com.recruitment.recruitmentchat.entity.Messages;
import com.recruitment.recruitmentchat.mapper.MessagesMapper;
import com.recruitment.recruitmentchat.repository.MessagesRepo;
import com.recruitment.recruitmentchat.service.MessagesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MessagesServiceImpl implements MessagesService {

    MessagesRepo messagesRepo;

    @Override
    public List<MessageDto> getMessages() {

        return messagesRepo
                .findAll()
                .stream()
                .map(MessagesMapper::mapToMessagesDto)
                .toList();
    }

    @Override
    public List<MessageDto> getMessagesById(Long userId) {
        return List.of();
    }

    @Override
    public MessageDto createMessage(MessageDto messageDto) {
        Messages messages = MessagesMapper.mapToMessages(messageDto);

        messagesRepo.save(messages);

        return messageDto;
    }

    @Override
    public MessageDto editMessage(Long id, MessageDto messageDto) {
        return null;
    }

    @Override
    public void deleteMessage(Long id) {
        messagesRepo.deleteById(id);
    }
}
