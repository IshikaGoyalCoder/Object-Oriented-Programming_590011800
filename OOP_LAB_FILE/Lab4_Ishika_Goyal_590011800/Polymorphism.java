// Parent Class
class Animal {

    // Method Overloading
    void eat() {
        System.out.println("Animal eats food");
    }

    void eat(String food) {
        System.out.println("Animal eats " + food);
    }

    // Method to Override
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class
class Dog extends Animal {

    // Method Overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main Class
public class Polymorphism {
    public static void main(String[] args) {

        Dog obj = new Dog();

        // Overloading
        obj.eat();
        obj.eat("Meat");

        // Overriding
        obj.sound();
    }
}
