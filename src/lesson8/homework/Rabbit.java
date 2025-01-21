package lesson8.homework;

public class Rabbit extends Animals {
    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    void voice() {
        System.out.println("Voice: squeak");
    }

    @Override
    void eat(String food) {
        if (food.equals("Grass")) {
            System.out.println("Rabbit loves to eat " + food);
        } else {
            System.out.println("Rabbit is not happy with " + food);
        }
    }
}
