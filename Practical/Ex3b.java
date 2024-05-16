class Shape {
    public double calculateArea() {
        System.out.println("Calculating area for a shape...");
        return 0;
    }
    public void displayShapeType() {
        System.out.println("This is generic shape...");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayShapeType() {
        System.out.println("This is Circle!");
    }
}

class Rectangle extends Shape {
    private double length;
    private double breath;

    public Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    @Override
    public double calculateArea() {
        return length * breath;
    }

    @Override
    public void displayShapeType() {
        System.out.println("This is Rectangle!");
    }
}

public class Ex3b {
    public static void main(String[] args) {
        Shape mycircle = new Circle(5.0);
        Shape myrect = new Rectangle(2.0, 7.0);

        double circleArea = mycircle.calculateArea();
        double RectangleArea = myrect.calculateArea();
        System.out.println("Area of circle is " + circleArea);
        mycircle.displayShapeType();
        System.out.println("Area of rectangle is " + RectangleArea);
        myrect.displayShapeType();
    }
}
