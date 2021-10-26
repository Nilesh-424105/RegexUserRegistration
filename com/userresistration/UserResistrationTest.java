package com.userresistration;

/*
 * As a User need to enter a valid First Name
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserResistrationTest {

	public static void main(String[] args) {

		System.out.println("Welcome To User Registration Program");

		// Creation Of Object
		UserRegistration user = new UserRegistration();
		// Regular Expression For First Name
		String regex = "^[A-Z]{1}[A-Za-z]{2,}";

		// print result
		System.out.println("Your Last Name Is : " + Pattern.matches(regex, user.inputMethod()));
		System.out.println("Your Last Name Is : " + Pattern.matches(regex, user.lastName()));

	}

}
