package com.recruitment.recruitmentchat.service;

import com.recruitment.recruitmentchat.dto.UserDto;
import com.recruitment.recruitmentchat.entity.User;

import java.util.List;


public interface UserService {
  UserDto findPhone(String phone);
  UserDto findEmail(String email);
  UserDto createUser(UserDto userDto);
  UserDto getUserById(Long userId);
  UserDto editUser(Long userId, User updatedUser);
  List<UserDto> getUsers();
  void deleteUser(Long userId);
}