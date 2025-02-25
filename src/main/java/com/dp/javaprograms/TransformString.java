package com.dp.javaprograms;

public class TransformString {

	public static void main(String[] args) {
        String input = "abbcccdddde";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int count = 1;

            // Count occurrences of the current character
            while (i + 1 < input.length() && input.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }

            // Append the character or its count if greater than 1
            if (count > 1) {
                output.append(count);
            } else {
                output.append(currentChar);
            }
        }

        System.out.println("Output: " + output.toString());
	}
}