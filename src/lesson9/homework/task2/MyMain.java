package lesson9.homework.task2;

public class MyMain {
    public static void main(String[] args) {
        Figures[] figures = {
                new Triangle(1,2,3),
                new Rectangle(2, 3),
                new Circle(1),
                new Triangle(4, 5, 6),
                new Rectangle(7, 8)
        };

        double totalPerimeter = 0;
        for (Figures figure : figures) {
            totalPerimeter += figure.perimeter();
        }
        System.out.println("Sum of all perimeters: " + totalPerimeter);
    }
}

