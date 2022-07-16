public class Rectangle implements IShape {
    double length, breadth;
    String color;

    Rectangle(String color, double length, double breadth) {
        this.color = color;
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return this.length * this.breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.length + this.breadth);
    }
    // Renderer renderer;
}
