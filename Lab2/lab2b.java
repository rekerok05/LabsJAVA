package Lab2;

import java.util.Scanner;

public class lab2b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Size array ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int maxindex = 0;
        int minindex = 0;
        for (int i = 0; i < n; i++) {
            if (("" + arr[i]).length() > ("" + arr[maxindex]).length())
                maxindex = i;
            if (("" + arr[i]).length() < ("" + arr[minindex]).length())
                minindex = i;
        }
        System.out.println("Max length = " + ("" + arr[maxindex]).length() + " is " + arr[maxindex]);
        System.out.println("Min length = " + ("" + arr[minindex]).length() + " is " + arr[minindex]);
    }
}
