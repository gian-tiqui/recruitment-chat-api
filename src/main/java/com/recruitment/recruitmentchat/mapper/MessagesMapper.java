package com.recruitment.recruitmentchat.mapper;

import com.recruitment.recruitmentchat.dto.MessageDto;
import com.recruitment.recruitmentchat.entity.Messages;

public class MessagesMapper {
  static public Messages mapToMessages(MessageDto messageDto) {

    return new Messages(
        messageDto.getMid(),
        messageDto.getSenderId(),
        messageDto.getReceiverId(),
        messageDto.getSentAt(),
        messageDto.getStatus()
    );
  }

  static public MessageDto mapToMessagesDto(Messages messages) {

    return new MessageDto(
        messages.getMid(),
        messages.getSenderId(),
        messages.getReceiverId(),
        messages.getSentAt(),
        messages.getStatus()
    );
  }
}