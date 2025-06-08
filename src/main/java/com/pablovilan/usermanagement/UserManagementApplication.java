package com.pablovilan.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class for the User Management System.
 * This class serves as the entry point for the Spring Boot application.
 * It initializes the application context and starts the embedded server.
 */
@SpringBootApplication
public class UserManagementApplication {

	/**
	 * The main method that starts the User Management application.
	 * It uses Spring Boot's SpringApplication.run() method to launch the application.
	 *
	 * @param args command-line arguments passed to the application
	 */
	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
	}

}
