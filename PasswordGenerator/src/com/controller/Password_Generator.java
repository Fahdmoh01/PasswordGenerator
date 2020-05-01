package com.controller;

import java.util.*;

public class Password_Generator {
	static char[] give_Password(int len) {
		System.out.println("Generating password using random():");
		System.out.print("Your new password is: ");
		String capital_chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small_chars="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String symbols=",./?;:'!@#$%^&*~0/)(<>=+";
		String values = capital_chars + small_chars + numbers + symbols;
		
		Random rndm_method = new Random();
		char[] password = new char[len];
		for(int i=0;i<len;i++) {
			password[i]= values.charAt(rndm_method.nextInt(values.length()));
		}
		
		return password;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of the OTP to be Generated");
		System.out.println(give_Password(sc.nextInt()));
		sc.close();
	}

}
