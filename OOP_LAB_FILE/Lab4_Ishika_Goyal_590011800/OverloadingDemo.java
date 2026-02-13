public class OverloadingDemo {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();
        System.out.println(obj.sum(2, 3));
        System.out.println(obj.sum(2, 3, 4));
    }
}