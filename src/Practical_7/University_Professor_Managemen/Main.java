package Practical_7.University_Professor_Managemen;

public class Main {

    public static void main(String[] args) {

        // Professor objects created independently
        Professor p1 = new Professor(101, "Rajesh", "Java", 50000);
        Professor p2 = new Professor(102, "Amit", "DBMS", 55000);
        Professor p3 = new Professor(103, "Priya", "Python", 60000);

        // Professor exists independently
        System.out.println("Professor exists before joining university:");
        p1.displayProfessorDetails();

        // University object
        University u1 = new University("Ganpat University", "Mehsana");

        // Add professors to university
        u1.addProfessor(p1);
        u1.addProfessor(p2);
        u1.addProfessor(p3);

        // Display university and professors
        System.out.println("\nUniversity Information");
        u1.displayProfessors();

        // Professor still exists independently
        System.out.println("Professor can still exist independently:");
        p1.teach();
    }
}
