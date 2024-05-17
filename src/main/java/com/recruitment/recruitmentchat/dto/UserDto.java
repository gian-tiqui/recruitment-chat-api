package com.recruitment.recruitmentchat.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

  private Long uid;
  private String password;
  private String firstName;
  private String middleName;
  private String lastName;
  private Integer birthYear;
  private Integer birthMonth;
  private Integer birthDate;
  private String sex;
  private String status;
  private String address;
  private String phone;
  private String email;
  private String userType;
  private LocalDate createdAt;
  private LocalDate updatedAt;

  public static int getAge(int birthYear, int birthMonth, int birthDate) throws UserDto.InvalidBirthdayException {
    LocalDate birthday = getBirthday(birthYear, birthMonth, birthDate);
    LocalDate today = LocalDate.now();
    Period period = Period.between(birthday, today);
    return period.getYears();
  }

  public static LocalDate getBirthday(int birthYear, int birthMonth, int birthDate) throws UserDto.InvalidBirthdayException {
    if (birthYear < 1 || birthMonth < 1 || birthMonth > 12 || birthDate < 1) {
      throw new UserDto.InvalidBirthdayException("Invalid birthday format. Please provide positive year, month (1-12), and date.");
    }

    try {
      return LocalDate.of(birthYear, birthMonth, birthDate);
    } catch (DateTimeParseException e) {
      throw new UserDto.InvalidBirthdayException("Invalid birthday. Please enter a valid date for the chosen month.");
    }
  }

  static class InvalidBirthdayException extends Exception {
    public InvalidBirthdayException(String message) {
      super(message);
    }
  }
}