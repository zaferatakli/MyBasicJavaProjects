package EmployeeManagement.Models.Employees;

import EmployeeManagement.Database.Employees;
import EmployeeManagement.Models.Departments.Department;


public class Employee {
    private String employeeId;
    private String fullName;
    private int salary;
    private Department Department;
    private String nameCode = "";
    private static int numberOfEmployees = 250;

    public Employee(String fullName, int salary, String departmentCode) {
        this.fullName = fullName;
        this.salary = salary;
        setDepartment(departmentCode);
        this.setEmployeeId();
        numberOfEmployees++;
        Employees.addEmployee(this);
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private void setDepartment(String department) {
            for (Department dep : EmployeeManagement.Database.Departments.getDepartmentList()) {
                if (dep.getDepartmentCode().equals(department)) {
                    this.Department = dep;
                }
            }
    }

    private void setEmployeeId() {
        this.employeeId = this.Department.getDepartmentCode() + numberOfEmployees + getEmployeeNameCode();
    }

    private String getEmployeeNameCode() {
        String[] names = fullName.split(" ");
        for (String name : names) {
            this.nameCode += name.substring(0, 1).toUpperCase();
        }
        return this.nameCode;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public Department getDepartment() {
        return this.Department;
    }

    public String getDepartmentName() {
        return this.Department.getDepartmentName();
    }

    public static void increaseMake(String employeeId) {
        if (employeeId.equals("")) {
            System.out.println("There's no such employee");
        }else {
            for (Employee employee : Employees.getEmployeeList()) {
                if (employee.getEmployeeId().equals(employeeId)) {
                    employee.setSalary(employee.getSalary() + employee.getSalary() * employee.getDepartment().getIncreaseRate() / 100);
                    System.out.println("Increase made");
                    return;
                }
            }
        }
    }

    @Override
    public String toString() {
        return this.getEmployeeId() + " " + this.getFullName() + " " + this.getDepartmentName() + " " + this.getSalary();
    }
}
