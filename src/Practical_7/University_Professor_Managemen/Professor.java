package Practical_7.University_Professor_Managemen;

public class Professor {

    private int professorId;
    private String name;
    private String subject;
    private double salary;

    public Professor(int professorId, String name, String subject, double salary) {
        this.professorId = professorId;
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }

    public void displayProfessorDetails() {
        System.out.println("Professor ID: " + professorId);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}
