package CompressionAlgorithm;

import java.util.Scanner;

public class CompressionAlgorithm {
    public static void main(String[] args) {
        /* Compression Algorithm Project */
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the text to be compressed without spaces:");
        String text = input.nextLine().trim().replace(" ", "") + " ";

        String zipText = "";
        int counter = 1;
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(i - 1)) {
                counter++;
            } else {
                zipText = zipText + counter + text.charAt(i - 1);
                counter = 1;
            }
        }

        System.out.println("Text entered: " + text);
        System.out.println("Compressed text: " + zipText);

        input.close();
    }
}

