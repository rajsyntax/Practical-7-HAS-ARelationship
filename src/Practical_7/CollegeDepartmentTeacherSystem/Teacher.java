package Practical_7.CollegeDepartmentTeacherSystem;


public class Teacher {

    private int teacherId;
    private String teacherName;
    private String subject;

    public Teacher(int teacherId, String teacherName, String subject) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.subject = subject;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void teach() {
        System.out.println(teacherName + " is teaching " + subject);
    }

    public void conductExam() {
        System.out.println(teacherName + " is conducting examination");
    }

    public void displayTeacherDetails() {
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Subject: " + subject);
    }
}
