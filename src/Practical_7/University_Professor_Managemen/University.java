package Practical_7.University_Professor_Managemen;

public class University {

    private String universityName;
    private String location;

    private Professor[] professors = new Professor[10];
    private int count = 0;

    public University(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
    }

    public void addProfessor(Professor professor) {
        professors[count] = professor;
        count++;
    }

    public void displayProfessors() {

        System.out.println("University Name: " + universityName);
        System.out.println("Location: " + location);

        System.out.println("\nProfessor Details:");

        for (int i = 0; i < count; i++) {
            professors[i].displayProfessorDetails();
        }
    }
}
