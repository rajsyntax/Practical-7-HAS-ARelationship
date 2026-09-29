package Practical_7.hospital_Management_system;



public class main {

    public static void main(String[] args) {

        Doctor doctor1 = new Doctor(101, "Amit Sharma", "Cardiologist");
        Doctor doctor2 = new Doctor(102, "Priya Patel", "Neurologist");

        Patient patient1 = new Patient(201, "Rajesh", 20, "Heart Problem");
        Patient patient2 = new Patient(202, "Rahul", 25, "Migraine");

        doctor1.displayDoctorDetails();
        doctor2.displayDoctorDetails();

        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        patient1.showMedicalStatus();
        patient2.showMedicalStatus();

        doctor1.treatPatient(patient1);
        doctor1.prescribeMedicine(patient1, "Aspirin");

        doctor2.treatPatient(patient2);
        doctor2.prescribeMedicine(patient2, "Paracetamol");
    }
}
