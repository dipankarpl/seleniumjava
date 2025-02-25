package com.dp.javaprograms;

public class RemoveWhitespace {
    public static void main(String[] args) {
        String originalString = "  This is   a test   string.  ";
        String stringWithoutSpaces = removeWhitespace(originalString);
        
        System.out.println("Original String: \"" + originalString + "\"");
        System.out.println("String without white spaces: \"" + stringWithoutSpaces + "\"");
    }

    static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", ""); // Removes all whitespace characters
    }
}