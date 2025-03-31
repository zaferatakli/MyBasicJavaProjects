package EmployeeManagement.Models.Departments;

public class HumanResourcesDepartment implements Department {
    final String departmentCode = "HRD";
    final int increaseRate = 20;

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
        return "Human resources department";
    }
}
