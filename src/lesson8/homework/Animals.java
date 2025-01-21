package lesson8.homework;

public class Animals {
    private String name;
    private int age;

    public Animals(String name, int age){
        this.name = name;
        this.age = age;
    }
    void voice() {
        System.out.println("Some generic animal sound");
    }

    void eat(String food) {
        System.out.println("This animal eats " + food);
    }
}
