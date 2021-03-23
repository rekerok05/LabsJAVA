package Lab1;

import java.util.Scanner;
public class lab1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Size array ");
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = in.nextInt();
            int max = 0, min = arr[0];
            for (int i = 0; i < n; i++) {
                if (arr[i] < min)
                    min = arr[i];
                if (arr[i] > max)
                    max = arr[i];
            }
            System.out.println("Max = " + max);
            System.out.println("Min = " + min);
    }
}
