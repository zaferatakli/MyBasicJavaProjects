package BookStoreProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class OnlineBookStore {
    private ArrayList<Book> bookList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addingBook() {
        System.out.print("Book name: ");
        String bookName = scanner.nextLine();
        System.out.print("Author name: ");
        String authorName = scanner.nextLine();
        System.out.print("Publication year: ");
        int publicationYear = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Book price: ");
        double bookPrice = scanner.nextDouble();
        scanner.nextLine();
        Book newBook = new Book(bookName, authorName, publicationYear, bookPrice);
        bookList.add(newBook);
        System.out.println("\nThe book was also successfully added: " + newBook);
    }

    public void deletingBook() {
        Book book = new Book();
        boolean isThere = false;
        if (!bookList.isEmpty()) {
            System.out.print("Enter the number of the book you want to delete: ");
            int bookNoToBeDeleted = scanner.nextInt();
            scanner.nextLine();
            Iterator<Book> iterator = bookList.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getBookNumber() == bookNoToBeDeleted) {
                    iterator.remove();
                    System.out.println("The book was deleted successfully.");
                    isThere = true;
                    break;
                }
            }
            if (!isThere) {
                System.out.println("The book number to be deleted was not found in the list!");
            }
        } else {
            System.out.println("Book list is empty!.");
        }
    }

    public void listingBook() {
        if (!bookList.isEmpty()) {
            for (Book book : bookList) {
                System.out.print(book + " ");
            }
        } else {
            System.out.println("Book list is empty!.");
        }
    }
}
