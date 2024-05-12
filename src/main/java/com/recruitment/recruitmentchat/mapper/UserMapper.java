package com.recruitment.recruitmentchat.mapper;

import com.recruitment.recruitmentchat.dto.UserDto;
import com.recruitment.recruitmentchat.entity.User;

import java.util.Locale;

public class UserMapper {
  static public User mapToUser(UserDto userDto) {

    return new User(
        userDto.getUid(),
        userDto.getPassword(),
        userDto.getFirstName(),
        userDto.getMiddleName(),
        userDto.getLastName(),
        userDto.getBirthYear(),
        userDto.getBirthMonth(),
        userDto.getBirthDate(),
        userDto.getSex(),
        userDto.getStatus(),
        userDto.getAddress(),
        userDto.getPhone(),
        userDto.getEmail(),
        userDto.getUserType(),
        userDto.getCreatedAt(),
        userDto.getUpdatedAt()
    );
  }

  static public UserDto mapToUserDto(User user) {

    return new UserDto(
        user.getUid(),
        user.getPassword(),
        user.getFirstName(),
        user.getMiddleName(),
        user.getLastName(),
        user.getBirthYear(),
        user.getBirthMonth(),
        user.getBirthDate(),
        user.getSex(),
        user.getStatus(),
        user.getAddress(),
        user.getPhone(),
        user.getEmail(),
        user.getUserType(),
        user.getCreatedAt(),
        user.getUpdatedAt()
    );
  }
}