package com.recruitment.recruitmentchat.controller;

import com.recruitment.recruitmentchat.dto.UserDto;
import com.recruitment.recruitmentchat.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping
    public ResponseEntity<Object> createUser(@RequestBody UserDto userDto) {

        if (userService.findEmail(userDto.getEmail()) != null) {
            return ResponseEntity.badRequest().body("Email already exists");
        }

        if (userService.findPhone(userDto.getPhone()) != null) {
            return ResponseEntity.badRequest().body("phone already exists");
        }

        UserDto savedUser = userService.createUser(userDto);

        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }


    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId) {

        UserDto foundUser = userService.getUserById(userId);

        return ResponseEntity.ok(foundUser);
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getUsers() {

        List<UserDto> userDtoList = userService.getUsers();

        return ResponseEntity.ok(userDtoList);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable("id") Long userId) {
        userService.deleteUser(userId);
    }

    @PostMapping
    public ResponseEntity<UserDto> authenticate(@RequestBody UserDto userDto) {
        return null;
    }
}