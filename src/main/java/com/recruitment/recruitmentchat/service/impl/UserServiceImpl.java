package com.recruitment.recruitmentchat.service.impl;

import com.recruitment.recruitmentchat.dto.UserDto;
import com.recruitment.recruitmentchat.entity.User;
import com.recruitment.recruitmentchat.exception.ResourceNotFoundException;
import com.recruitment.recruitmentchat.mapper.UserMapper;
import com.recruitment.recruitmentchat.repository.UserRepo;
import com.recruitment.recruitmentchat.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

  private UserRepo userRepo;

  @Override
  public UserDto createUser(UserDto userDto) {
    User user = UserMapper.mapToUser(userDto);

    User savedUser = userRepo.save(user);

    return UserMapper.mapToUserDto(savedUser);
  }

  @Override
  public UserDto getUserById(Long userId) {

    User foundUser = userRepo
        .findById(userId)
        .orElseThrow(() -> new ResourceNotFoundException("User not found"));

    return UserMapper.mapToUserDto(foundUser);
  }

  @Override
  public UserDto editUser(Long userId, User updatedUser) {
    return null;
  }

  @Override
  public List<UserDto> getUsers() {
    List<User> userDtoList = userRepo.findAll();

    return userDtoList
        .stream()
        .map(UserMapper::mapToUserDto)
        .collect(Collectors.toList());
  }

  @Override
  public void deleteUser(Long userId) {
    userRepo.deleteById(userId);
  }
}