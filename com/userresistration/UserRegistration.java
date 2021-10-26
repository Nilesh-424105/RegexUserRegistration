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

	// Method For Email Validation
	public String email() {

		// Take Input From User
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email Address: ");
		// Assign User Input in Variable
		String email = sc.nextLine();
		// Return Email
		return email;

	}

	// Method For Mobile Number Validation
	public String mobNumber() {

		// Take Input From User
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile Number: ");
		// Assign User Input in Variable
		String mobNumber = sc.nextLine();
		// Return Mobile Number
		return mobNumber;

	}

	// Method For Password Validation
	public String password() {

		// Take Input From User
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password: ");
		// Assign User Input in Variable
		String password = sc.nextLine();
		// Return Mobile Number
		return password;

	}
}
