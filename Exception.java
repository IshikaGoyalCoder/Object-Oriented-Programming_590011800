import java.util.Scanner;

// Custom Exception
class InvalidDataException extends java.lang.Exception {
    InvalidDataException(String msg) {
        super(msg);
    }
}

class Person {

    String name;
    int age;
    float salary;

    void getData() throws InvalidDataException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name (max 20 chars): ");
        name = sc.nextLine();

        if (name.length() > 20) {
            throw new InvalidDataException("Name should not exceed 20 characters!");
        }

        System.out.print("Enter Age (>5): ");
        age = sc.nextInt();

        if (age <= 5) {
            throw new InvalidDataException("Age must be greater than 5!");
        }

        System.out.print("Enter Salary: ");
        salary = sc.nextFloat();
    }

    void display() {
        System.out.println("\nEntered Data:");
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Salary = " + salary);
    }
}

public class Exception {
    public static void main(String[] args) {

        Person p = new Person();

        try {
            p.getData();
            p.display();
        } 
        catch (InvalidDataException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("\nProgram finished");
        }
    }
}
