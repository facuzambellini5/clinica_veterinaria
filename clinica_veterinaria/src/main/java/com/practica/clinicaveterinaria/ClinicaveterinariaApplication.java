package com.practica.clinicaveterinaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClinicaveterinariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicaveterinariaApplication.class, args);
		System.out.println("DB_URL: " + System.getenv("DB_URL"));
		System.out.println("DB_USER_NAME: " + System.getenv("DB_USER_NAME"));
		System.out.println("DB_PASSWORD: " + System.getenv("DB_PASSWORD"));
	}

}
