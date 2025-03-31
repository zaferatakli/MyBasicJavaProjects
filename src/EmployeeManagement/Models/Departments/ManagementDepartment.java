package EmployeeManagement.Models.Departments;

public class ManagementDepartment implements Department {
    final String departmentCode = "MD";
    final int increaseRate = 30;

    @Override
    public int getIncreaseRate() {
        return increaseRate;
    }

    @Override
    public String getDepartmentCode() {
        return departmentCode;
    }

    @Override
    public String getDepartmentName() {
        return "Management Department";
    }
}
