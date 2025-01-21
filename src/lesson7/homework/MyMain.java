package lesson7.homework;

public class MyMain {
    public static void main(String[] args) {
        {
            Patient patient1 = new Patient("Alex", "Ivanov", 1);
            Patient patient2 = new Patient("Ivan", "Sidorov", 2);
            Patient patient3 = new Patient("Maxim", "Petkevich", 3);
            Clinic clinic = new Clinic();
            clinic.assignDoctorToPatient(patient1);
            clinic.assignDoctorToPatient(patient2);
            clinic.assignDoctorToPatient(patient3);
        }
    }
}

