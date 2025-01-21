package lesson7.homework;

public class Patient {
    String name;
    String surname;
    int treatmentPlan;
    Doctor doctor;

    public Patient(String name, String surname, int treatmentPlan) {
        this.name = name;
        this.surname = surname;
        this.treatmentPlan = treatmentPlan;
    }
}
