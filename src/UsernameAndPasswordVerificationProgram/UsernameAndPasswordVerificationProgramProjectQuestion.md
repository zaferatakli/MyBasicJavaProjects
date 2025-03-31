**Username and Password Verification Program**

---

### **Program Description**

#### 1. **Set Username and Password**:
- Prompt the user to create a username and password.
- Ask the user to enter the password twice for confirmation.
- If the passwords do not match, display a warning and prompt the user to re-enter the password.

#### 2. **Login Process**:
- Provide the user an option to log in using the previously set username and password.
- Ask the user to input their username.
- Run the program in a loop, prompting the user to enter their password, allowing up to three attempts.
- After each incorrect password attempt, display the remaining attempts (e.g., "You have 3 attempts left," "You have 2 attempts left," "This is your last attempt").

#### 3. **Login Verification**:
- If the user fails to enter the correct password three times in a row, terminate the program and display the message:
  `"Sorry, you entered the wrong password three times in a row."`
- If the login is successful, display the message:
  `"Login successful. Welcome to the system as user [username]!"`

---

### **Design Tips**

- Use the **`Scanner`** class to get user input.
- Use variables to store the username and password.
- Implement a **`while` loop** to allow the user up to three incorrect login attempts.
- Use the **`equals`** method to compare passwords.
- Use **`System.out.println`** to display messages to the user.

---

### **Example Workflow**
1. **Set Username and Password**:
   - User creates a username: `JohnDoe`
   - User sets a password: `Password123`
   - User re-enters password: `Password123`
   - Passwords match → Proceed.

2. **Login Process**:
   - User enters username: `JohnDoe`
   - User enters password: `WrongPassword` → Remaining attempts: 2
   - User enters password: `WrongPassword` → Remaining attempts: 1
   - User enters password: `Password123` → Login successful.

3. **Failed Login**:
   - After three incorrect attempts, display: `"Sorry, you entered the wrong password three times in a row."`