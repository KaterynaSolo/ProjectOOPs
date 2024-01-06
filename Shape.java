package ProjectOOPs;
/*
Create an Interface 'Shape' with undefined methods as calculateArea and
calculatePerimeter. Create 2 classes Circle & Square that implements
functionality defined in the Shape Interface. Test your code.
 */
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI* radius*radius;
    }
    @Override
    public double calculatePerimeter() {
        return radius * Math.PI*2;
    }
}
class Square implements Shape{
    private double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 2*side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }
}
