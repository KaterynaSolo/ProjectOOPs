package ProjectOOPs;

public class ShapeTester {
    public static void main(String[] args) {
        Circle c = new Circle(7.5);
        System.out.println("The area of circle is: "+c.calculateArea());
        System.out.println("The perimeter of circle is: "+c.calculatePerimeter());

        Square s =new Square(9.5);
        System.out.println("The area of square is: "+s.calculateArea());
        System.out.println("The perimeter of square is: "+s.calculatePerimeter());


    }
}
