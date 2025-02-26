package com.dp.javaprograms;

public class ChangeCase {

	public static void main(String[] args) {
		String str = "Hello World%";

		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (char c : arr) {
			if (Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			} else if (Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			}else {
				sb.append(Character.toLowerCase(c));
			}
				
		}
		System.out.println(sb);

	}

}
