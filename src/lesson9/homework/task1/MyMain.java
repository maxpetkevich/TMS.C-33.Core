package lesson9.homework.task1;

public class MyMain {
    public static void main(String[] args) {
        JobTitle director = new Director();
        JobTitle accountant = new Accountant();
        JobTitle worker = new Worker();
        director.printJobTitle();
        accountant.printJobTitle();
        worker.printJobTitle();
    }
}
