// 11. WAP to print a value by using keyword Static and without using static .

class StaticNonStatic {

    static int x = 50;   // static variable
    int y = 100;         // non-static variable

    public static void main(String[] args) {

        // Access static variable
        System.out.println("Static value = " + x);

        // Access non-static variable using object
        StaticNonStatic obj = new StaticNonStatic();
        System.out.println("Non-static value = " + obj.y);
    }
}
