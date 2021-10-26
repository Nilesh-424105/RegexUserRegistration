package com.userresistration;

import java.util.Scanner;

public class UserRegistration {

	// Method For First Name Validation
	public String inputMethod() {

		// Take Input From User
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		// Assign User Input in Variable
		String firstName = sc.nextLine();
		// Return First Name
		return firstName;

	}

}
