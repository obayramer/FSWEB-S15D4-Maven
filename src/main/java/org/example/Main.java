package org.example;

public class Main {

    // Palindrom kontrol metodu
    public static boolean checkForPalindrome(String input) {
        String cleaned = input.replaceAll("[\\W_]", "").toLowerCase();
        int length = cleaned.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Decimal'i binary'ye çeviren metot
    public static String convertDecimalToBinary(int number) {
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);
            number = number / 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        System.out.println("Palindrome Check:");
        System.out.println("\"I did, did I?\" : " + checkForPalindrome("I did, did I?"));
        System.out.println("\"Racecar\" : " + checkForPalindrome("Racecar"));
        System.out.println("\"hello\" : " + checkForPalindrome("hello"));
        System.out.println("\"Was it a car or a cat I saw ?\" : " + checkForPalindrome("Was it a car or a cat I saw ?"));

        System.out.println("\nDecimal to Binary Conversion:");
        System.out.println("5 in binary: " + convertDecimalToBinary(5));
        System.out.println("6 in binary: " + convertDecimalToBinary(6));
        System.out.println("13 in binary: " + convertDecimalToBinary(13));
    }
}