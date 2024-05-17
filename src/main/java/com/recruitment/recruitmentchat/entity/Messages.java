package com.recruitment.recruitmentchat.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "messages")
public class Messages {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long mid;

  @Column(name = "sender_id")
  private Long senderId;

  @Column(name = "receiver_id")
  private Long receiverId;

  @Column(name = "sent_at")
  private LocalDateTime sentAt;

  @Column(name = "status")
  private String status;
}