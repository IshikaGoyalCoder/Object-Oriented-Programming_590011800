class A {
    int sum(int a, int b) {
        return a + b;
    }
}

public class OverridingDemo extends A {

    @Override
    int sum(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        A obj = new OverridingDemo();
        System.out.println(obj.sum(2, 3));
    }
}