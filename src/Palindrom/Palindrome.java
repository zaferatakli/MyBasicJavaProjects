package Palindrom;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a word/sentence: ");
        String enteredExpression = scanner.nextLine().trim();
        scanner.close();

        if (isPalindrome(enteredExpression)) {
            System.out.println("The entered expression is a palindrome.");
        } else {
            System.out.println("The entered expression is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        String reverse = "";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            reverse = reverse + str.charAt(str.length() - 1 - i);
        }
        return str.equalsIgnoreCase(reverse);
    }
}

