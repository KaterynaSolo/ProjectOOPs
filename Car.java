package ProjectOOPs;
/*
Create a Class Car that would have the following fields: carPrice and color and method
calculateSalePrice() which should be returning a price of the car.
Create 2 subclasses: Sedan and Truck. The Truck class has a field as weight and has its
own implementation of calculateSalePrice() method in which returned price is calculated
as following: if weight>2000 then returned price car should include 10% discount,
otherwise 20% discount. The Sedan class has field as length and also does it its own
implementation of calculateSalePrice(): if length of sedan is >20 feet then returned
car price should include 5% discount, otherwise 10% discount.
 */
public class Car {
   private double carPrice;
   private String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }
    public double calculateSalePrice(){
      return carPrice;
  }
}
class Truck extends Car{
    private double weight;
    public Truck (double carPrice, String color, double weight){
        super(carPrice,color);
        this.weight=weight;
    }
    @Override
    public double calculateSalePrice() {
        if(weight>2000){
            return super.calculateSalePrice()*0.9;
        }else{
            return super.calculateSalePrice()*0.8;
        }
    }
}
class Sedan extends Car{
    private double length;

    public Sedan(double carPrice, String color,double length) {
        super(carPrice, color);
        this.length=length;
    }

    @Override
    public double calculateSalePrice() {
        if(length > 20){
            return super.calculateSalePrice()*0.95;
        }else{
            return super.calculateSalePrice()*0.9;
        }

    }
}
