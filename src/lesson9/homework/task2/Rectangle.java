package lesson9.homework.task2;

public class Rectangle extends Figures {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return (2 * (width + height));
    }

    @Override
    public double area() {
        return (width * height);
    }
}
