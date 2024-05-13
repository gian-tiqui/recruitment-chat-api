package com.recruitment.recruitmentchat.repository;

import com.recruitment.recruitmentchat.dto.UserDto;
import com.recruitment.recruitmentchat.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByPhone(String phone);
}
