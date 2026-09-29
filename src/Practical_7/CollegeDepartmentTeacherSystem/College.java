package Practical_7.CollegeDepartmentTeacherSystem;


import java.util.ArrayList;

public class College {

    private String collegeName;
    private String location;
    private ArrayList<Department> departments;

    public College(String collegeName, String location) {
        this.collegeName = collegeName;
        this.location = location;
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayDepartments() {
        System.out.println("\nCollege: " + collegeName);
        System.out.println("Location: " + location);

        System.out.println("\nDepartments:");
        for (Department d : departments) {
            System.out.println(d.getDepartmentName());
        }
    }
}
