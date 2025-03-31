package EmployeeManagement.Database;

import EmployeeManagement.Models.Employees.Employee;
import java.util.ArrayList;

public class Employees {
    private static ArrayList<Employee> employeeList = new ArrayList<>();

    public static ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public static void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public static void deleteEmployeeWithId(String employeeId) {
        boolean found = false;
        for (Employee employee : employeeList) {
            if (employee.getEmployeeId().equals(employeeId)) {
                employeeList.remove(employee);
                found = true;
                System.out.println("The employee was successfully deleted.");
                break;
            }
        }
        if (!found) {
            System.out.println("There is no such employee");
        }
    }
    public static void printInEmployeesDepartment(String departmentCode) {
        for (Employee employee2 : employeeList) {
            if (employee2.getDepartment().getDepartmentCode().equals(departmentCode)) {
                System.out.println(employee2);
            }
        }
    }

    public static void printEmployees() {
        for (Employee employee3 : employeeList) {
            System.out.println(employee3);
        }
    }
}
