package Lab2;
/**
 * @author Vitkouski S.D.
 * forked: 09.02.2021.
 * done: 12.02.2021
 */
import java.util.Scanner;

public class lab2b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Size array ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        sortMin(arr);
        System.out.println("");
        printArr(arr);
        System.out.println("");
        sortMax(arr);
        printArr(arr);
        System.out.println("");
//        int maxindex = 0;
//        int minindex = 0;
//        for (int i = 0; i < n; i++) {
//            if (("" + arr[i]).length() > ("" + arr[maxindex]).length())
//                maxindex = i;
//            if (("" + arr[i]).length() < ("" + arr[minindex]).length())
//                minindex = i;
//        }
//        System.out.println("Max length = " + ("" + arr[maxindex]).length() + " is " + arr[maxindex]);
//        System.out.println("Min length = " + ("" + arr[minindex]).length() + " is " + arr[minindex]);
//
        }


    public static void sortMin(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (("" + array[j]).length() < ("" + array[j - 1]).length()) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
    }

    public static void sortMax(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (("" + array[j]).length() > ("" + array[j - 1]).length()) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
    }

    public static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
