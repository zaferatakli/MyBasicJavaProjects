**Salesperson Salary Calculation Project**

---

### **Objective**
This project aims to calculate the salary of a company’s salesperson. According to company policy, a salesperson receives a fixed salary along with a commission based on total sales revenue and performance level. If the total sales exceed the specified performance level, a higher commission rate (0.10) is applied; otherwise, a lower commission rate (0.05) is used. Develop a program to calculate the salesperson's total salary.

---

### **Program Description**
1. Collect inputs from the user:
   - Fixed salary
   - Total sales revenue
   - Specified performance level

2. Determine the commission rate based on performance level.

3. Calculate the commission using the determined rate.

4. Calculate and display the total salary.

---

### **Design**

1. **Define Variables**:
   - `total_salary` (float)
   - `fixed_salary` (float)
   - `commission` (float)
   - `sales_revenue` (float)
   - `commission_rate` (float)
   - `performance_level` (float)

2. **Collect Inputs**:
   - `fixed_salary`, `sales_revenue`, `performance_level`

3. **Analysis**:
   - The total salary is calculated based on the fixed salary and performance-based commission.
   - The commission depends on whether the total sales revenue exceeds the specified performance level.

4. **Determine Commission Rate**:
   ```
   if (sales_revenue > performance_level) {
       commission_rate = 0.10;
   } else {
       commission_rate = 0.05;
   }
   ```

5. **Calculate Commission**:
   - `commission = sales_revenue * commission_rate`

6. **Calculate Total Salary**:
   - `total_salary = fixed_salary + commission`

7. **Display Total Salary**:
   - Example Output:
     - Fixed Salary: $2000
     - Sales Revenue: $5000
     - Performance Level: $4000
     - Commission Rate: 0.10
     - Commission: $500
     - **Total Salary: $2500**