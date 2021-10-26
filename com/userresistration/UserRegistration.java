package com.userresistration;

import java.util.Scanner;

public class UserRegistration {

	// Method For First Name Validation
	public String firstName() {

		// Take Input From User
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		// Assign User Input in Variable
		String firstName = sc.nextLine();
		// Return First Name
		return firstName;

	}

	// Method For Last Name Validation
	public String lastName() {

		// Take Input From User
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Last Name: ");
		// Assign User Input in Variable
		String lastName = sc.nextLine();
		// Return Last Name
		return lastName;

	}

}
