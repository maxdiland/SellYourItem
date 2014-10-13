package com.gmail.krvmax.encodestring;

/**
 * author: Maxim Diland
 */
public class StringEncoder {

    public static String encode(String stringToEncode) {
        if (stringToEncode.length() == 0) {
            return stringToEncode;
        }

        String encodedString = "";
        Character previousChar = null;
        int charCount = 0;

        for (char currentChar : stringToEncode.toCharArray()) {
            if (previousChar != null) {
                if (previousChar == currentChar) {
                    charCount++;
                } else {
                    encodedString += previousChar + "" + charCount;
                    previousChar = currentChar;
                    charCount = 1;
                }
            } else {

            }


            if (previousChar != null && previousChar == currentChar) {
                charCount++;
            } else {
                if (charCount != 0) {
                    encodedString += previousChar + "" + charCount;
                }
                previousChar = currentChar;
                charCount = 1;
            }
        }

        return encodedString + previousChar + charCount;
    }

    public static void main(String[] args) {
        String h = "Hello world!";

        System.out.println( encode(h) );
    }
}
