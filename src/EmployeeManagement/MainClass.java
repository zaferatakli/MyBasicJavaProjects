package EmployeeManagement;

import EmployeeManagement.Database.Employees;
import EmployeeManagement.Models.Employees.Employee;
import java.util.*;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("Welcome to the company panel. Please choose a process.");
            System.out.println("---------------------------------------------");
            System.out.println("1-Employee operations\n2-View All Employees\n3-View All Employees in the Department\n4-Exit");
            System.out.println("---------------------------------------------");
            System.out.print("Operation : ");
            int mainMenuChoice = input.nextInt();
            System.out.println("Your transaction is being processed, please wait...");
            Thread.sleep(1500);

            if (mainMenuChoice == 1) {
                while (true) {
                    System.out.println("---------------------------------------------");
                    System.out.println("Welcome to the Employee Transactions Panel, Please select a transaction.");
                    System.out.println("1-Add Employees\n2-Delete Employee\n3-Make a Raise\n4-Previous Menu\n");
                    System.out.print("Operation : ");
                    int employeeMenuChoice = input.nextInt();
                    System.out.println("Your transaction is being processed, please wait...\n");
                    Thread.sleep(1000);

                    if (employeeMenuChoice == 1) {
                        System.out.print("Please enter name and surname : ");
                        String employeeFullName = stringInput.nextLine();

                        System.out.print("Please enter salary : ");
                        int employeeSalary = input.nextInt();

                        System.out.print("Please enter the department code : ");
                        String employeeDepartmentCode = stringInput.nextLine();

                        new Employee(employeeFullName, employeeSalary, employeeDepartmentCode);
                        System.out.println("The employee was successfully added. You are being transferred to the previous menu...");
                        Thread.sleep(1000);
                        break;
                    } else if (employeeMenuChoice == 2) {
                        System.out.print("Please enter the ID of the employee you want to delete : ");
                        String employeeId = stringInput.nextLine();
                        Employees.deleteEmployeeWithId(employeeId);
                        System.out.println(employeeId + " Successfully erased. You are transferred to the Previous Menu....");
                        Thread.sleep(1000);
                        break;
                    } else if (employeeMenuChoice == 3) {
                        System.out.print("Please enter the ID of the employee you want to increase : ");
                        String employeeId = stringInput.nextLine();
                        Employee.increaseMake(employeeId);
                        System.out.println("The operation was successful, you are transferred to the previous menu");
                        Thread.sleep(1000);
                        break;
                    } else if (employeeMenuChoice == 4) {
                        System.out.println("Your transaction is being processed, please wait...\n");
                        Thread.sleep(1000);
                        break;
                    } else {
                        System.out.println("You have made an incorrect selection, please try again.");
                    }
                }
            } else if (mainMenuChoice == 2) {
                System.out.print("All employees are listed...");
                Thread.sleep(1000);
                for (int i = 0; i < 20; i++) {
                    System.out.print('>');
                    Thread.sleep(100);
                }
                System.out.println(' ');
                System.out.println("---------------------------------------------");
                Employees.printEmployees();
                System.out.println("---------------------------------------------");
            } else if (mainMenuChoice == 3) {
                System.out.print("Please enter the department code : ");
                String departmentCode = stringInput.nextLine();
                System.out.print("All employees are listed...");
                Thread.sleep(1000);
                for (int i = 0; i < 20; i++) {
                    System.out.print('>');
                    Thread.sleep(100);
                }
                System.out.println(' ');
                System.out.println("---------------------------------------------");
                Employees.printInEmployeesDepartment(departmentCode);
                System.out.println("---------------------------------------------");
            } else {
                System.out.print("You have successfully exited, we wish you a good day.");
                break;
            }
        }
    }
}
