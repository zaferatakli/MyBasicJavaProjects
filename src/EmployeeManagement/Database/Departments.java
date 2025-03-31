package EmployeeManagement.Database;

import EmployeeManagement.Models.Departments.Department;
import EmployeeManagement.Models.Departments.HumanResourcesDepartment;
import EmployeeManagement.Models.Departments.InformationTechnologiesDepartment;
import EmployeeManagement.Models.Departments.ManagementDepartment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Departments {
    // TODO Bu class'da bir sey degistirmenize gerek yok

    static private final Department BILISIM_TEKNOLOJILERI_DEPARTMANI = new InformationTechnologiesDepartment();
    static private final Department YONETIM_DEPARTMANI = new ManagementDepartment();
    static private final Department INSAN_KAYNAKLARI_DEPARTMANI = new HumanResourcesDepartment();
    static private List<Department> DepartmentList = new ArrayList<>(Arrays.asList(BILISIM_TEKNOLOJILERI_DEPARTMANI, YONETIM_DEPARTMANI, INSAN_KAYNAKLARI_DEPARTMANI));

    // getter method
    public static List<Department> getDepartmentList() {
        return DepartmentList;
    }

}


























