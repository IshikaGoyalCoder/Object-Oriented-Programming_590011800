// 12. Write a program to check whether the two strings are same or not in java.

import java.util.Scanner;

class StringCompare {
    public static void main(String[] args) {      

        Scanner sc = new Scanner(System.in);

        String s1, s2;

        System.out.print("Enter first string: ");   
        s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        s2 = sc.nextLine();

        if (s1.equals(s2)) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }
    }
}

