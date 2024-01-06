package ProjectOOPs;

public class CarTester {
    public static void main(String[] args) {

        Truck t = new Truck(70000,"Black",35000);
        System.out.println("The sale price of the truck with discount is $"+t.calculateSalePrice());

        Sedan s = new Sedan(35000,"White",25);
        System.out.println("The sale price of the sedan with discount is $"+s.calculateSalePrice());
    }
}

