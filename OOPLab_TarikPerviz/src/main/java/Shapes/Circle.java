package Shapes;

class Circle extends Shape {
    private double radius;

    public Circle(String color, FillType fillType, double radius) {
        super(color, fillType);
        this.radius = radius;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(double PI, double r) {
        return 2 * PI * r;
    }

    public double calculateCircumference(double r) {
        final double PI = Math.PI; // Use a constant value of PI
        return 2 * PI * r;
    }
}
