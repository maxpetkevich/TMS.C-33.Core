package lesson8.homework;

public class MyMain {
    public static void main(String[] args) {
        Animals dog = new Dog("Dog", 3);
        dog.voice();
        dog.eat("Meat");
        dog.eat("Grass");
        System.out.println("------------------------------");
        Animals tiger = new Tiger("Tiger", 10);
        tiger.voice();
        tiger.eat("Meat");
        tiger.eat("Grass");
        System.out.println("------------------------------");
        Animals rabbit = new Rabbit("Rabbit", 1);
        rabbit.voice();
        rabbit.eat("Grass");
        rabbit.eat("Meat");
    }
}
