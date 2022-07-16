public class Square extends Rectangle {

    Square(String color, double side) {
        super(color, side, side);
    }

    @Override
    public double calculateArea() {
        System.out.println("Square.calculateArea() is called");
        return super.length * super.breadth;
    }
}
