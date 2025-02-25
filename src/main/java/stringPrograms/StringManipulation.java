package stringPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class StringManipulation {

	public static void main(String[] args) {
//		reverseString("abcdef");
//		palindromeString("racecar");
//		countOccurrences("tortoise");
//		firstNonRepeatingChar("aabc");
//		removeDuplicates("aabbcc");
//		areAnagrams("listen", "silent ");
//		compress("abbcccaaa");
//		longestCommonPrefix(new String[] { "flower", "flow", "flight" });
		
	}

	private static void longestCommonPrefix(String[] strings) {
		if (strings == null || strings.length == 0) {
			System.out.println("longestCommonPrefix of " + Arrays.toString(strings) + ": none");
		}
		String prefix = strings[0];
		for (int i = 1; i < strings.length; i++) {
			while (!strings[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					System.out.println("longestCommonPrefix: none");
				}
			}
		}
		System.out.println("longestCommonPrefix of " + Arrays.toString(strings) + ": " + prefix);
	}

	private static void compress(String string) {
		String str = "";
		int count = 1;

		for (int i = 1; i < string.length(); i++) {
			if (string.charAt(i) == string.charAt(i - 1)) {
				count++;
			} else {
				str = str + string.charAt(i - 1) + String.valueOf(count);
				count = 1;
			}
		}
		str = str + string.charAt(string.length() - 1) + count;
		System.out.println(string + " after compression: " + str);
	}

	private static void areAnagrams(String string1, String string2) {
		int flag = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : string1.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else
				map.put(c, 1);
		}

		for (char c : string2.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) - 1);
			} else
				map.put(c, 1);
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() != 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(string1 + " & " + string2 + " are anagrams");
		} else
			System.out.println(string1 + " & " + string2 + " are not anagrams");

	}

	private static void removeDuplicates(String string) {
		HashSet<Character> set = new HashSet<>();
		String str = "";

		for (char c : string.toCharArray()) {
			if (!set.contains(c)) {
				set.add(c);
				str = str + c;
			}
		}
		System.out.println(string + " without duplicate characters: " + str);
	}

	private static void firstNonRepeatingChar(String string) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : string.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else
				map.put(c, 1);
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("first non occuring char from the string " + string + " is: " + entry.getKey());
				break;
			}
		}
	}

	private static void countOccurrences(String string) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : string.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else
				map.put(c, 1);
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey() + " : " + entry.getValue() + "\t");
		}
		System.out.println();
	}

	private static void palindromeString(String string) {
		int left = 0;
		int right = string.length() - 1;
		while (left < right) {
			if (string.charAt(left) != string.charAt(right)) {
				System.out.println(string + " is not palindrome string");
			}
			left++;
			right--;
		}
		System.out.println(string + " is palindrome string");
	}

	private static void reverseString(String string) {
		char[] ch = string.toCharArray();
		int left = 0;
		int right = ch.length - 1;

		while (left < right) {
			char temp;
			temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
		System.out.println("input: " + string + "\toutput: " + new String(ch));
	}

}
