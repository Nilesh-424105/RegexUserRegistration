package com.userresistration;

/*
 * As a User need to follow Predefine password Format
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserResistrationTest {

	public static void main(String[] args) {

		System.out.println("Welcome To User Registration Program");

		// Creation Of Object
		UserRegistration user = new UserRegistration();
		// Regular Expression For User Registration
		String firstNameRegex = "^[A-Z]{1}[A-Za-z]{2,}";
		String lastNameRegex = "^[A-Z]{1}[A-Za-z]{2,}";
		String emailRegex = "^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*[@]{1}[a-z]+[.]{1}[a-z]{2,4}[.]*[a-z]*{2}$";
		String mobNumRegex = "^[9]{1}[1]{1}[ ][789]{1}[0-9]{9}$";
		String passwordRegex = "^[A-Za-z0-9]*[!@#$%^&*]{1}[A-Za-z0-9]*$";

		// print result
		System.out.println("Your First Name Is : " + Pattern.matches(firstNameRegex, user.firstName()));
		System.out.println("Your Last Name Is : " + Pattern.matches(lastNameRegex, user.lastName()));
		System.out.println("Your Email Address Is : " + Pattern.matches(emailRegex, user.email()));
		System.out.println("Your Mobile Number Is : " + Pattern.matches(mobNumRegex, user.mobNumber()));
		System.out.println("Your Password Is : " + Pattern.matches(passwordRegex, user.password()));

	}

}
