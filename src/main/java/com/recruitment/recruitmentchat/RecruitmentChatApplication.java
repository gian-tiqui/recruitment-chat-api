package com.recruitment.recruitmentchat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class RecruitmentChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecruitmentChatApplication.class, args);
	}

}
