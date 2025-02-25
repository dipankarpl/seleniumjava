package com.dp.javaprograms;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
	public static void main(String[] args) {
		String s = "abcdbcbb";
		int length = lengthOfLongestSubstring(s);
		System.out.println("Length of the longest substring without repeating characters: " + length);
	}

	static int lengthOfLongestSubstring(String s) {
		HashSet<Character> charSet = new HashSet<>();
		int left = 0, maxLength = 0;

		for (int right = 0; right < s.length(); right++) {// a b c d b
			// If the character is already in the set, remove characters from the left
			while (charSet.contains(s.charAt(right))) {// false
				charSet.remove(s.charAt(left));
				left++;
			}
			// Add the current character to the set
			charSet.add(s.charAt(right));// a b c d 
			// Calculate the maximum length
			maxLength = Math.max(maxLength, right - left + 1);// 1 2 3 4
		}

		return maxLength;
	}
}
