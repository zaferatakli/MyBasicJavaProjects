package PascalTriangle;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines for Pascal Ucgeni \uD83D\uDD3C : ");
        int number = input.nextInt();
        pascalTriangle(number);
    }

    public static void pascalTriangle(int numRows) {
        int[][] pascal = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}

