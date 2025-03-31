package EmployeeManagement.Models.Departments;

public class InformationTechnologiesDepartment implements Department {
    final String departmentCode = "ITD";
    final int increaseRate = 25;

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
        return "Information Technologies Department";
    }
}
