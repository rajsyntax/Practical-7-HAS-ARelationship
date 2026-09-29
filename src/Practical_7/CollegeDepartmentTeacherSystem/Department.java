package Practical_7.CollegeDepartmentTeacherSystem;


import java.util.ArrayList;

public class Department {

    private int departmentId;
    private String departmentName;
    private ArrayList<Teacher> teachers;

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        teachers = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void conductClass(Teacher teacher) {
        System.out.println("\nClass conducted by " + teacher.getTeacherName());
        teacher.teach();
    }

    public void displayTeachers() {
        System.out.println("\nTeachers in " + departmentName + " Department:");

        for (Teacher t : teachers) {
            t.displayTeacherDetails();
            System.out.println();
        }
    }
}
