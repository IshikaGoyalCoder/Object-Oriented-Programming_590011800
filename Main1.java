package package1;

// Class must be public to be imported by other packages
public class Car {
    public int mileage; // public so Main2 can assign values
    public int price;

    // A constructor helps in assigning values easily
    public Car() {
        this.mileage = 0;
        this.price = 0;
    }
}

class Main1 {
    public static void main(String[] args) {
        Car c2 = new Car();
        
        // Value assignment into objects
        c2.mileage = 20;
        c2.price = 15000;
        
        System.out.println("Car 2 Mileage: " + c2.mileage);
    }
}