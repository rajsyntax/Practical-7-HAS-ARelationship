package Practical_7.Student_Management_System;

public class main {

    public static void main(String[] args) {

        // 3 Course Objects
        Course c1 = new Course(101, "Java");
        Course c2 = new Course(102, "Python");
        Course c3 = new Course(103, "DBMS");

        // 2 Student Objects
        Student s1 = new Student(1, "Rajesh");
        Student s2 = new Student(2, "Amit");

        // Enroll Courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c2);
        s2.enrollCourse(c3);

        // Display Information
        s1.displayStudent();
        s2.displayStudent();
    }
}
