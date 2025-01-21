package lesson7.homework;

public class Surgeon extends Doctor {
     public Surgeon(String name, String surname) {
        super(name, surname);
    }
        @Override void treat () {
        System.out.println("Surgeon " + name + " " + surname + " method 1");
    }
    }
