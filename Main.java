public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Green", 4, 5);
        System.out.println("Area - " + rectangle.calculateArea());
        System.out.println("Perimeter - " + rectangle.calculatePerimeter());
        rectangle.renderer.draw();
        rectangle.renderer.draw("This is a rectangle");

        Square square = new Square("Yellow", 5);
        System.out.println("Area - " + square.calculateArea());
        System.out.println("Perimeter - " + square.calculatePerimeter());
        square.renderer.draw();
        square.renderer.draw("This is a Square");

        Circle circle = new Circle("Purple", 7);
        System.out.println("Area - " + circle.calculateArea());
        System.out.println("Perimeter - " + circle.calculatePerimeter());
        circle.renderer.draw();
        circle.renderer.draw("This is a circle");

        Triangle triangle = new Triangle("Red", 4, 5);
        System.out.println("Area - " + triangle.calculateArea());
        System.out.println("Perimeter - " + triangle.calculatePerimeter());
        triangle.renderer.draw();
        triangle.renderer.draw("This is a triangle");
    }
}
