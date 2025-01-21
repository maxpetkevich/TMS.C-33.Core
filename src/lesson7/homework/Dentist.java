package lesson7.homework;

public class Dentist extends Doctor {
    public Dentist(String name, String surname) {
        super(name, surname);
    }

    @Override
    void treat() {
        System.out.println("Dentist " + name + " " + surname + "method 2");
    }
}
