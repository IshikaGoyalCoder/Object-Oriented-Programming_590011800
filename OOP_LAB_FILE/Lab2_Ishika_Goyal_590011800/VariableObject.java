//5. Declare the variable above the main method and access it inside main by creating an object 
// of the class.

class VariableObject {

    int a = 10;   // variable declared above main

    public static void main(String[] args) {

        VariableObject obj = new VariableObject(); // object created
        System.out.println("Value of a = " + obj.a);
    }
}
