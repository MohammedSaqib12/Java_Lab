public class Ex3a {
    public double calculateArea(double sideLength) {
        return sideLength * sideLength;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Ex3a calculator = new Ex3a();

        double squareArea = calculator.calculateArea(5.0);
        System.out.println("Area of square with side length 5: " + squareArea);

        double rectangleArea = calculator.calculateArea(4.0, 
   6.0);
        System.out.println("Area of rectangle with length 4 and width 6: " + rectangleArea);

        double circleArea = calculator.calculateArea(3.0);
        System.out.println("Area of circle with radius 3: " + 
   circleArea);
    }
}
