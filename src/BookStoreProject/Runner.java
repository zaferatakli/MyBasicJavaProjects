package BookStoreProject;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        OnlineBookStore onlineBookStore = new OnlineBookStore();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.print("""
                    
                    ** Online Book Store Menu **
                    
                    1--> Adding a Book
                    2--> Deleting a Book
                    3--> Book Listing
                    0--> Exit
                    
                    Your transaction selection:\s""");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    onlineBookStore.addingBook();
                    break;
                case 2:
                    onlineBookStore.deletingBook();
                    break;
                case 3:
                    onlineBookStore.listingBook();
                    break;
                case 0:
                    System.out.println("The program is ending...");
                    break;
                default:
                    System.out.println("You have made an invalid selection. Please try again.\n");
                    break;
            }
        }
        while (choice != 0);
    }
}

