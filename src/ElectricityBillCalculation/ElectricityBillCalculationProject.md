

# ⚡ Electricity Bill Calculation Project

## 🎯 Objective

This project aims to develop a program that calculates a customer's **monthly electricity bill** for a power supply company.  
The bill will be calculated based on the difference between the **latest and previous meter readings**, and the **unit price** will depend on the total consumption.

---

## ❓ Problem

According to the electricity company's subscription policy, the customer's bill is calculated using the following steps:

1. **electricity_consumption = new_reading - previous_reading**
2. Determine **unit_price** based on electricity consumption.
3. Calculate the **monthly_bill** as:  
   **monthly_bill = electricity_consumption × unit_price**

| 🔌 **Electricity Consumption (kWh)** | 💰 **Unit Price (per kWh)** |
|-------------------------------------|------------------------------|
| 0 - 100                             | 1.1                          |
| 101 - 200                           | 1.3                          |
| 201 - 300                           | 1.5                          |
| 301 - 400                           | 1.7                          |
| 401 - 500                           | 1.9                          |
| 501 and above                       | 2.3                          |

---

## 🔍 Analysis

The key objective is to calculate the **monthly electricity bill** using the company’s pricing policy:

1. **electricity_consumption = new_reading - previous_reading**
2. Based on the consumption amount, determine:
    - 0–100 kWh → Unit Price: 1.1
    - 101–200 kWh → Unit Price: 1.3
    - 201–300 kWh → Unit Price: 1.5
    - 301–400 kWh → Unit Price: 1.7
    - 401–500 kWh → Unit Price: 1.9
    - 501+ kWh → Unit Price: 2.3
3. Calculate:
    - **monthly_bill = electricity_consumption × unit_price**

---

## 🧩 Design

### 🔧 1. Define Variables

- `monthly_bill` → *float*
- `electricity_consumption` → *int*
- `unit_price` → *float*
- `new_reading` → *int*
- `previous_reading` → *int*

---

### 🧾 2. Take Input from User

- `new_reading` (latest meter reading)
- `previous_reading` (last month’s meter reading)

---

### 🧮 3. Perform Calculations

- **Step 1:**  
  `electricity_consumption = new_reading - previous_reading`

- **Step 2:**  
  Determine `unit_price` based on consumption:

  ```text
  If consumption is 0–100 → unit_price = 1.1  
  If 101–200 → unit_price = 1.3  
  If 201–300 → unit_price = 1.5  
  If 301–400 → unit_price = 1.7  
  If 401–500 → unit_price = 1.9  
  If 501+ → unit_price = 2.3
  ```

- **Step 3:**  
  `monthly_bill = electricity_consumption × unit_price`

---

### 🖥️ 4. Display the Bill

- Show the user their **monthly electricity bill** calculated using the entered readings and pricing policy.

---
