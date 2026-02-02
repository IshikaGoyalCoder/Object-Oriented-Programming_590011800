// 7. WAP to tell frequency of a particular element in an array .
import java.util.Scanner;

class FrequencyArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, count = 0;
        System.out.print("Enter array size: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to find frequency: ");
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        System.out.println("Frequency of element = " + count);
    }
}

