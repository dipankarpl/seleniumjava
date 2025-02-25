package com.dp.javaprograms;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        String originalString = "00012345";
        String stringWithoutLeadingZeros = removeLeadingZeros(originalString);
        
        System.out.println("Original String: \"" + originalString + "\"");
        System.out.println("String without leading zeros: \"" + stringWithoutLeadingZeros + "\"");
    }

    static String removeLeadingZeros(String str) {
        // Use regex to replace leading zeros
        return str.replaceAll("^0+", "");
    }
}