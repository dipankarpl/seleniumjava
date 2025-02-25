package com.dp.javaprograms;

import java.util.HashSet;
import java.util.Scanner;

public class UsernameStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter student username");
		Scanner scn = new Scanner(System.in);
		System.out.println(saveUsername(scn.next()));

	}

	private static String saveUsername(String next) {
		// TODO Auto-generated method stub
		HashSet<String> usr = new HashSet<String>();
		if (!next.matches("[a-zA-Z0-9]+")) {
			return "invalid";
		} else if (usr.contains(next)) {
			return "invalid";
		} else
			usr.add(next);
			return "valid";
	}

}
