package com.dp.javaprograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "crazy frog jump";
		char arr[] = str.toCharArray();
		Set<Character> hashSet = new HashSet<Character>();
		StringBuilder sb = new StringBuilder();
		for (char c : arr) {
			if (!hashSet.contains(c)) {
				hashSet.add(c);
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
}
