package lesson7.homework;

public class Therapist extends Doctor {
    public Therapist(String name, String surname) {
        super(name, surname);
    }

    @Override
    void treat() {
        System.out.println("Therapist "  + name + " " + surname + " method 3 ");
    }

    void chooseTreatmentPlan(Patient patient, Doctor surgeon, Doctor dentist) {
        if (patient.treatmentPlan == 1) {
            patient.doctor = surgeon;
        } else if (patient.treatmentPlan == 2) {
            patient.doctor = dentist;
        } else {
            patient.doctor = this;
        }
            patient.doctor.treat();

    }
}