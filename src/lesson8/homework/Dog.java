package lesson8.homework;

public class Dog extends Animals {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void voice() {
        System.out.println("Voice: bark");
    }

    @Override
    void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Dog loves to eat " + food);
        } else {
            System.out.println("Dog is not happy with " + food);
        }
    }
}
