package com.recruitment.recruitmentchat.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDto {

  private Long mid;
  private Long senderId;
  private Long receiverId;
  private LocalDateTime sentAt;
  private String status;
}