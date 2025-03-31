package SalespersonSalaryCalculation;

import java.util.Scanner;

public class SalespersonSalaryCalculation {
    public static void main(String[] args) {
        /*Salesperson Salary Calculation Project */
        float bonus, bonusRate, fixedSalary, totalIncomeFromSales, performanceLevel, totalSalary;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your fixed salary: ");
        fixedSalary = input.nextFloat();
        System.out.print("Enter your total income from sales: ");
        totalIncomeFromSales = input.nextFloat();
        System.out.print("Enter the specified performance level: ");
        performanceLevel = input.nextFloat();
        if (totalIncomeFromSales > performanceLevel) {
            bonusRate = 0.10f;
        } else {
            bonusRate = 0.05f;
        }
        bonus = totalIncomeFromSales * bonusRate;
        totalSalary = fixedSalary + bonus;
        System.out.println("Total Salary: " + totalSalary + "$");

    }
}
