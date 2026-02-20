// First Thread Class
class T1 extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("T1: " + i);
        }
    }
}

// Second Thread Class
class T2 extends Thread {

    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println("T2: " + i);
        }
    }
}

// Main Class
public class Multithreading {

    public static void main(String[] args) {

        T1 t1 = new T1();
        T2 t2 = new T2();

        t1.start();   // Start first thread
        t2.start();   // Start second thread
    }
}
