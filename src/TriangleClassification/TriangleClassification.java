package TriangleClassification;

import java.util.Scanner;

public class TriangleClassification {
    public static void main(String[] args) {
        /*Triangle Classification Project */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the first side of the triangle: ");
        int side1 = input.nextInt();
        System.out.print("Enter the length of the second side of the triangle: ");
        int side2 = input.nextInt();
        System.out.print("Enter the length of the third side of the triangle:");
        int side3 = input.nextInt();

        if ((side1 + side2 > side3) && (side3 > Math.abs(side1 - side2))) {
            System.out.println("Valid Triangle!");
            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral triangle!");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Isosceles Triangle!");
            } else {
                System.out.println("Different Side Triangle!");
            }
        } else {
            System.out.println("Invalid Triangle!");
        }
    }
}
