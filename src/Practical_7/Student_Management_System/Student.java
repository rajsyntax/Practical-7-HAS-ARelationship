package Practical_7.Student_Management_System;

public class Student {

    private int studentId;
    private String studentName;
    private Course[] courses = new Course[10];
    private int count = 0;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void enrollCourse(Course course) {
        courses[count] = course;
        count++;
    }

    public void displayStudent() {
        System.out.println("\nStudent ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Enrolled Courses:");

        for (int i = 0; i < count; i++) {
            System.out.println("- " + courses[i].getCourseName());
        }
    }
}