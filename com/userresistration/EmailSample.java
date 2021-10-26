package com.userresistration;

import java.util.regex.Pattern;

/*
 * Should clear all email samples provided separately
 */

public class EmailSample {

	public static void main(String[] args) {

		System.out.println("Welcome To User Registration Program");

		String emailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

		System.out.println(Pattern.matches(emailRegex, "abc@yahoo.com"));
		System.out.println(Pattern.matches(emailRegex, "abc-100@yahoo.com"));
		System.out.println(Pattern.matches(emailRegex, "abc.100@yahoo.com"));
		System.out.println(Pattern.matches(emailRegex, "abc111@abc.com"));
		System.out.println(Pattern.matches(emailRegex, "abc-100@abc.net"));
		System.out.println(Pattern.matches(emailRegex, "abc.100@abc.com.au"));
		System.out.println(Pattern.matches(emailRegex, "abc"));
		System.out.println(Pattern.matches(emailRegex, "abc@%*.com"));
		System.out.println(Pattern.matches(emailRegex, "abc()*@gmail.com"));
		System.out.println(Pattern.matches(emailRegex, "abc@abc@gmail.com"));
		System.out.println(Pattern.matches(emailRegex, "abc@gmail.com.1a"));
		System.out.println(Pattern.matches(emailRegex, "abc()*@gmail.com"));
	}

}
