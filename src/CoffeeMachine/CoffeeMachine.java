package CoffeeMachine;

import java.util.*;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        System.out.println("""
                Options:
                --------------------------------
                Turkish Coffee ☕
                Filter Coffee \uD83C\uDF75
                Espresso ☕\uFE0E
                --------------------------------""");
        String whichCoffee;
        while (true) {
            System.out.print("Please write which coffee you want:");
            whichCoffee = scannerStr.nextLine().toLowerCase().trim();

            if (whichCoffee.equals("turkish coffee")) {
                System.out.println("☕ " + whichCoffee + " getting ready...⏳");
                break;
            } else if (whichCoffee.equals("filter coffee")) {
                System.out.println("\uD83C\uDF75 " + whichCoffee + " getting ready...⏳");
                break;
            } else if (whichCoffee.equals("espresso")) {
                System.out.println("☕\uFE0E " + whichCoffee + " getting ready...⏳");
                break;
            } else {
                System.out.println("Wrong Tapping‼️ Please re-enter.\n");
            }
        }

        System.out.println();
        while (true) {
            System.out.print("Do you want us to add milk \uD83E\uDD5B ? (Yes/No):");
            String answer = scannerStr.nextLine().toLowerCase().trim();
            if (answer.equals("yes")) {
                System.out.println("Adding milk \uD83E\uDD5B...⏳");
                break;
            } else if (answer.equals("no")) {
                System.out.println("No milk is added.");
                break;
            } else {
                System.out.println("You clicked the wrong button ‼\uFE0F Please try again");
            }
        }

        System.out.println();
        String sugar;
        while (true) {
            System.out.print("Would you like sugar ◽? (Yes/No):");
            sugar = scannerStr.nextLine().toLowerCase().trim();

            if (sugar.equals("yes")) {
                System.out.print("How many sugars would you like?: ");
                int piece = scannerInt.nextInt();
                System.out.println(piece + " ◽ adding pieces of sugar...⏳");
                break;
            } else if (sugar.equals("no")) {
                System.out.println("No added sugar.");
                break;
            } else {
                System.out.println("You have pressed the wrong button ‼\uFE0F Please try again.");
            }
        }

        System.out.println();
        String size;
        while (true) {
            System.out.print("Which size do you want? (Enter as Large - Medium - Small:");
            size = scannerStr.nextLine().toLowerCase().trim();

            if (size.equals("large")) {
                System.out.println("Your coffee is prepared in a " + size + " size...⏳");
                break;
            } else if (size.equals("medium")) {
                System.out.println("Your coffee is prepared in a " + size + " size...⏳");
                break;
            } else if (size.equals("small")) {
                System.out.println("Your coffee is prepared in a " + size + " size...⏳");
                break;
            } else {
                System.out.println("You made the wrong keystroke ‼️ Please try again");
            }
        }
        System.out.println();
        System.out.println(size.toUpperCase() + " Size, " + whichCoffee.toUpperCase() + ", Ready \nEnjoy ❤️");
        scannerStr.close();
        scannerInt.close();
    }
}
