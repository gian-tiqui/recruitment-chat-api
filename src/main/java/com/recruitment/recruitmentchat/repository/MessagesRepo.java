package com.recruitment.recruitmentchat.repository;

import com.recruitment.recruitmentchat.entity.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepo extends JpaRepository<Messages, Long> {
}
