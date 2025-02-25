package com.dp.javaprograms;

public class StringImmutability {
    public static void main(String[] args) {
        // Create a String object
        String originalString = "Hello, World!";
        
        // Attempt to modify the String by concatenation
        String modifiedString = originalString.concat(" How are you?");
        
        // Print both the original and modified strings
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }
}