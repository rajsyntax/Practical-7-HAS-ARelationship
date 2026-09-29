package Practical_7.hospital_Management_system;


public class Patient {

    private int patientId;
    private String patientName;
    private int age;
    private String disease;

    public Patient(int patientId, String patientName, int age, String disease) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.disease = disease;
    }

    public String getPatientName() {
        return patientName;
    }

    public void displayPatientDetails() {
        System.out.println("\nPatient Details");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
    }

    public void showMedicalStatus() {
        System.out.println(patientName +
                " is suffering from " + disease);
    }
}
