package Oops.Polymorphism.classic;

public class PolyDemo {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.draw();

        Shape shape2 = new Triangle();
        shape2.draw();

        Shape shape3 = new Square();
        shape3.draw();
    }
}
