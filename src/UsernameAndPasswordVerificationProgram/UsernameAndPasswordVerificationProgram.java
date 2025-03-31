package UsernameAndPasswordVerificationProgram;

import java.util.Scanner;

public class UsernameAndPasswordVerificationProgram {
    public static void main(String[] args) {
        /* Username and Password Verification Program*/

        System.out.println("\nWelcome!\n");
        Scanner input = new Scanner(System.in);

        System.out.print("Please choose a username: ");
        String userNameEntry = input.nextLine();
        String firstPassword, confirmPassword;
        do {
            System.out.print("Please choose a password: ");
            firstPassword = input.nextLine();

            System.out.print("Please confirm your password: ");
            confirmPassword = input.nextLine();

            if (!firstPassword.equals(confirmPassword)) {
                System.out.println("\nPasswords are not the same, please re-enter: ");
            }
        } while (!firstPassword.equals(confirmPassword));

        System.out.println("You have set your username and password.");
        System.out.println();

        System.out.println("--- Please enter your information to log in. ---\n");

        String userName, password;
        int attempts = 3;

        for (int i = attempts; i >= 1; i--) {
            System.out.print("username: ");
            userName = input.nextLine();
            System.out.print("password: ");
            password = input.nextLine();

            if (userName.equals(userNameEntry) && firstPassword.equals(password)) {
                System.out.println("\nYou have successfully logged in.\n\n" + userName + " Welcome to the system!");
                break;
            } else {
                System.out.println("\nLogin Failed!\n");
                switch (i) {
                    case 1:
                        System.out.println("Your account has been locked!");
                        break;
                    case 2:
                        System.out.println("Your last entry!\n");
                        break;
                    case 3:
                        System.out.println("You have two entries left!\n");
                        break;
                }
            }
        }
        input.close();
    }
}
