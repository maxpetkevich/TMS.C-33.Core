package lesson8.homework;

public class Tiger extends Animals {
    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    void voice() {
        System.out.println("Voice: roar");
    }

    @Override
    void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Tiger loves to eat " + food);
        } else {
            System.out.println("Tiger is not happy with " + food);
        }
    }
}
