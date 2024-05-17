package com.recruitment.recruitmentchat.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long uid;

  @Column(name = "password")
  private String password;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "middle_name")
  private String middleName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "birth_year")
  private Integer birthYear;

  @Column(name = "birth_month")
  private Integer birthMonth;

  @Column(name = "birth_date")
  private Integer birthDate;

  @Column(name = "sex")
  private String sex;

  @Column(name = "status")
  private String status;

  @Column(name = "address")
  private String address;

  @Column(name = "phone")
  private String phone;

  @Column(name = "email")
  private String email;

  @Column(name = "user_type")
  private String userType;

  @Column(name = "created_at")
  private LocalDate createdAt;

  @Column(name = "updated_at")
  private LocalDate updatedAt;

  public static int getAge(int birthYear, int birthMonth, int birthDate) throws InvalidBirthdayException {
    LocalDate birthday = getBirthday(birthYear, birthMonth, birthDate);
    LocalDate today = LocalDate.now();
    Period period = Period.between(birthday, today);
    return period.getYears();
  }

  public static LocalDate getBirthday(int birthYear, int birthMonth, int birthDate) throws InvalidBirthdayException {
    if (birthYear < 1 || birthMonth < 1 || birthMonth > 12 || birthDate < 1) {
      throw new InvalidBirthdayException("Invalid birthday format. Please provide positive year, month (1-12), and date.");
    }

    try {
      return LocalDate.of(birthYear, birthMonth, birthDate);
    } catch (DateTimeParseException e) {
      throw new InvalidBirthdayException("Invalid birthday. Please enter a valid date for the chosen month.");
    }
  }

  static class InvalidBirthdayException extends Exception {
    public InvalidBirthdayException(String message) {
      super(message);
    }
  }
}