// 9. Write a Java program where a constructor is defined in one class and invoked from the main 
// class.

class A {
    A() {
        System.out.println("Constructor called");
    }
}

class ConstructorDemo {
    public static void main(String[] args) {
        A obj = new A();   // constructor invoked
    }
}
