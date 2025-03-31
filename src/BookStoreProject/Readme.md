# Online Book Store Management System

## Project Description
This project involves designing a module for an online bookstore that allows users to add, remove, and list books available for sale. The system will be implemented using Java and will feature object-oriented programming principles.

## Project Structure
```
src
├───bookStore
│       Book.java
│       OnlineBookStore.java
│       Readme.md
│       Runner.java
```

## Features
1. **Book Class:**
    - Contains attributes such as book name, author name, publication year, and price.
    - Each book is assigned a unique and sequential ID automatically using a `static` variable.

2. **OnlineBookStore Class:**
    - Manages a collection of books using an ArrayList.
    - Includes methods for adding, removing, and listing books.
    - Ensures that when deleting a book, a validation check is performed to confirm its existence.
    - If a book does not exist, an error message will be displayed: *"No book found with the specified ID."*

   ```java
   class OnlineBookStore {
       private ArrayList<Book> bookList = new ArrayList<>();
       private Scanner scanner = new Scanner(System.in);

       public void addBook() {...}

       public void removeBook() {...}

       public void listBooks() {...}
   }
   ```

3. **User Menu:**
    - Provides the following options to the user:
      ```
      ============ Online Book Store ============
        1. Add a Book
        2. Remove a Book by ID
        3. List All Books
        4. Exit
      ```
    - The system runs continuously until the user selects the exit option.
    - If an invalid selection is made, the message *"Invalid choice. Please try again."* is displayed.

## Technologies Used
- Java
- Object-Oriented Programming (OOP)
- IntelliJ IDEA

## How to Run the Project
1. Clone the repository from GitHub.
2. Open the project in IntelliJ IDEA.
3. Run the `Runner.java` file.
4. Follow the on-screen prompts to interact with the application.

## Author
- **Zafer Atakli**

## License
This project is open-source and available under the MIT License.
