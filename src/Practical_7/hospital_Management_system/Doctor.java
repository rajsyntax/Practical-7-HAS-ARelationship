package Practical_7.hospital_Management_system;


public class Doctor {

    private int doctorId;
    private String doctorName;
    private String specialization;

    public Doctor(int doctorId, String doctorName, String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    public void displayDoctorDetails() {
        System.out.println("\nDoctor Details");
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialization: " + specialization);
    }

    public void treatPatient(Patient patient) {
        System.out.println("\nDr. " + doctorName +
                " is treating " + patient.getPatientName());
    }

    public void prescribeMedicine(Patient patient, String medicine) {
        System.out.println("Dr. " + doctorName +
                " prescribed " + medicine +
                " to " + patient.getPatientName());
    }
}
