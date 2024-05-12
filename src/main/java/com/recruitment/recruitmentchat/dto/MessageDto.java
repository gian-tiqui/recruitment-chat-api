package com.recruitment.recruitmentchat.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageDto {

  private Long mid;
  private Long senderId;
  private Long receiverId;
  private LocalDateTime sentAt;
  private String status;
}