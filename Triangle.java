class Triangle implements IShape {
    double base;
    double height;
    String color;

    public Triangle(String color, double base, double height) {
        this.color = color;
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * this.base * this.height;
    }

    @Override
    public double calculatePerimeter() {
        double hyp = Math.sqrt(Math.pow(this.base, 2)
                + Math.pow(this.height, 2));
        return this.base + this.height + hyp;
    }
}