package Shapes;

public class Shape {
    private String color;
    private FillType fillType;

    public Shape(String color, FillType fillType) {
        this.color = color;
        this.fillType = fillType;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Filled: " + fillType);
    }

    public double getArea() {
        return 0.0; // Default area for a generic shape
    }
}

