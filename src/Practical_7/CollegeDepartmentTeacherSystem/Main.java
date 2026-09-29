package Practical_7.CollegeDepartmentTeacherSystem;



public class Main {

    public static void main(String[] args) {

        College college =
                new College("Ganpat University", "Mehsana");

        Department cse =
                new Department(101, "Computer Science");

        Department it =
                new Department(102, "Information Technology");

        Teacher t1 =
                new Teacher(1, "Raj Patel", "Java");

        Teacher t2 =
                new Teacher(2, "Priya Shah", "DBMS");

        Teacher t3 =
                new Teacher(3, "Amit Mehta", "Python");

        college.addDepartment(cse);
        college.addDepartment(it);

        cse.addTeacher(t1);
        cse.addTeacher(t2);

        it.addTeacher(t3);

        college.displayDepartments();

        cse.displayTeachers();
        it.displayTeachers();

        cse.conductClass(t1);

        System.out.println();
        t1.conductExam();

        System.out.println("\nRelationships Used:");
        System.out.println("College -> Department = Composition");
        System.out.println("Department -> Teacher = Aggregation");
        System.out.println("Department conducts class with Teacher = Association");
    }
}
