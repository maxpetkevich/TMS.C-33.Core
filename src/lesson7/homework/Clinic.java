package lesson7.homework;

public class Clinic {
    Doctor surgeon;
    Doctor therapist;
    Doctor dentist;

    public Clinic() {
        this.surgeon = new Surgeon("Andrey", "Gogalev");
        this.therapist = new Therapist("Anna", "Petrova");
        this.dentist = new Dentist("Igor", "Ladushkin");
    }

    void assignDoctorToPatient(Patient patient) {
        System.out.println("Patient: " + patient.name + " " + patient.surname);
        ((Therapist) therapist).chooseTreatmentPlan(patient, surgeon, dentist);
    }
}
