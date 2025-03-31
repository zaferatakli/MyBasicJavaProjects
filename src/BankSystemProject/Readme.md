# Techno Study Banking Project

## Project Overview: Banking Application

### 1. Customer Class
- **Fields**:
```java
 int customerId;
 String firstName;
 String lastName;
 String city;
```

- **Constructors**:
```java
... Customer(){...}; 
... Customer(int customerId, String firstName, String lastName, String city){...}; 
```
- **Getter and Setter Methods**

### 2. AccountType Enum Class
- `toString(){...};` **method**

- Constants:
  - `CHECKING` (Checking Account),
  - `SAVINGS` (Savings Account),
  - `CREDIT` (Credit Account)

### 3. Account Class
- **Fields**:
```java
    int accountId;
    int customerId;
    double balance;
    AccountType accountType;
```
- **Constructors**:
```java
... Account(){...};
... Account(int accountId, int customerId, AccountType accountType){};
```

- **Getter and Setter Methods**
- `depositToAmount(double amount)` **method (Deposit Money)**
- `withdrawFromAmount(double amount)` **method (Withdraw Money)**
- `toString()` **method**

### 4. BankSimulation Class
- **Fields**:
```java
  Map<Integer, Customer> customers;
  List<Account> accounts;
  Scanner scanner;
```
- **Constructors**:
```java
  BankSimulation() { 
     customers = new HashMap<>(); 
     accounts = new ArrayList<>(); 
     scanner = new Scanner(System.in); 
 }
```

- **Main Method**
```java 
    public static void main(String[] args){
    ...
}
```
- `run()` method
- `listCustomers()` method
- `listCustomerAccounts(Customer customer)` method
- `addCustomer()` method
- `customerOperationsMenu()` method
- `customerOperations(Customer customer)` method
- `openNewAccount(Customer customer)` method
- `depositToAccount(Customer customer)` method
- `withdrawFromAccount(Customer customer)` method
- `checkBalance(Customer customer)` method
- `getAccountById(int accountId)` method

## Project Structure:
```bash
BankingSystem
├── src
│ ├── Customer.java
│ ├── AccountType.java
│ ├── Account.java
│ └── BankSimulation.java
└── README.txt (Optional)
```

## Tasks
1. Create the project structure and place the given classes in their respective files.
2. Implement getter and setter methods in the "Customer" class.
3. Implement `depositToAmount()` and `withdrawFromAmount()` methods in the "Account" class.
4. Complete the customer addition and listing functions in the "BankSimulation" class.
5. Complete the new account creation and account transaction functions in the "BankSimulation" class.
6. Start the application in the `main` method and handle user interactions through the user interface.

## Notes
- Implement appropriate error handling for invalid inputs (optional).

## Additional Information
- The `BankSimulation` class manages banking operations and provides the main user interface. The `main` method is located in this class and starts the banking simulation. The `run` method creates the main menu and directs operations based on user inputs.
- The `Customer` class represents bank customers and contains customer details.
- The `Account` class represents bank accounts and contains account-related information. It also includes transaction methods such as `withdrawFromAmount` (withdraw money) and `depositToAmount` (deposit money).
- The `AccountType` enum represents different types of accounts: checking, savings, and credit.
- The `BankSimulation` class utilizes `customers` and `accounts` variables as `final` to prevent reference changes, ensuring better security and control. However, while the reference itself cannot be modified, the contents of the `HashMap` and `List` can still be updated as needed.

## Author
- **Zafer Atakli**

## License
This project is open-source and available under the MIT License.
