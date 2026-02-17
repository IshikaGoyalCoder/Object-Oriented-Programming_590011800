package package2;

// Importing the Car class from package1
import package1.Car;

public class Main2 {
    public static void main(String[] args) {
        // Creating an object of Car (from package1)
        Car c = new Car();
        
        // Value assignment (This works because fields are public)
        c.mileage = 15;
        c.price = 25000;
        
        System.out.println("Car in Package 2 - Mileage: " + c.mileage + ", Price: " + c.price);
    }
}



