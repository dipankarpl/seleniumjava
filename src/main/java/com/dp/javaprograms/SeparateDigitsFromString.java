package com.dp.javaprograms;

public class SeparateDigitsFromString {
	public static void main(String[] args) {
		String input = "abc123def456ghi789";
		StringBuilder digits = new StringBuilder();
		StringBuilder nonDigits = new StringBuilder();

		// Iterate through each character in the string
		for (char ch : input.toCharArray()) {
			if (Character.isDigit(ch)) {
				digits.append(ch); // Collect digits
			} else {
				nonDigits.append(ch); // Collect non-digit characters
			}
		}

		System.out.println("Digits: " + digits);
		System.out.println("Non-Digits: " + nonDigits);
	}

}
