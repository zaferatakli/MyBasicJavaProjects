# Employee Registration Project

Hello everyone,  
This documentation is here to guide you through the project and help you understand its structure and purpose in a simpler way.

## Project Purpose

The main goal of the project is to register employees into a company. However, each employee must be associated with a **department** so that we can:
- List employees based on their departments, and
- Apply salary raises based on department-specific raise rates.

---

## Project Requirements

1. **Each department should have its own raise rate.**
    - This rate will be taken into account in the `applyRaise()` method of the `Employee` class.
    - **Only** the specified rate should be applied when increasing the employee’s salary.
        - Example:
            - Person A works in the IT department with a salary of 10,000.
            - Person B works in the HR department with a salary of 10,000.
            - Assume the IT department has a 25% raise rate, and the HR department has a 20% rate.
            - After one raise:
                - A's salary becomes **12,500**
                - B's salary becomes **12,000**

2. **Raise Rate Constraints:**
    - The raise rate should be **final** (cannot be changed).
    - However, it should be **accessible** (i.e., public within its class) so that it can be used in the raise method.
    - Raises must be applied using the **employee ID**.

3. **Raise rates are fixed** within each department and must be applied to **every employee** belonging to that department.

4. **Each employee must have a unique ID.**
    - To distinguish between employees, each must have a unique identifier (ID).
        - Example:
            - There are two employees both named *Fırat Yılmaz*, working in the same department.
            - If we want to give a raise to only one of them, we need a way to distinguish them.
            - This distinction should be made using the **employee's ID**.

---

## ID Definition

(To be defined in the next section...)

İşte eklediğiniz bilgilerin İngilizce çevirisi ve `.md` formatında belgelenmiş haliyle devamı:

---

## Employee ID Format

Each employee's ID must be uniquely generated using the following format:

Department Code + (Number of employees in the company + 1) + Initials of the employee's full name

- Example:
  - There are 257 employees in the company.
  - A new employee named **Caglar Bulut** is being added to the **Information Technology Department** (code: `ITD`).
  - Then, Caglar’s ID should be: **ITD258CB**

## ID-Based Operations

- Operations such as applying raises or deleting an employee **must be done using their ID**.
- The system should **prompt for the employee ID** when such operations are requested.

## Department-Based Access

- Employees should be accessible **through their departments**.
- Example: The program must support **listing all employees** in a given department (e.g., “List all employees in the HR department”).

### Console Output for Employees

- When printing employee information to the console, only the following details should be displayed:
  - Employee ID
  - Full Name (First and Last)
  - Salary
  - Department Name

- Example console output:

Employee ID : 'ITD1CB', Name : 'Caglar Bulut', Salary : '25000', Department : 'Information Technology Department'


💡 *Tip:* You can implement this formatting easily using the `toString()` method in the `Employee` class.


---
