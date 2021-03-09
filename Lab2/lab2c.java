package Lab2;

import java.util.Scanner;

public class lab2c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Size matrix ");
        int n = in.nextInt();
        int[][] matrix = makeMatrix(n);
        printMatrix(matrix);
        System.out.println();
        moveMatrix(matrix);
        printMatrix(matrix);
    }

    public static int[][] makeMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = rndNumber(-n, n);
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                System.out.printf("%4d", matrix[i][j]);
            System.out.println();
        }
    }

    public static void printTransMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                System.out.printf("%4d", matrix[j][i]);
            System.out.println();
        }
    }

    public static int rndNumber(int min, int max) {
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }

    public static void moveMatrix(int[][] matrix) {
        Scanner in = new Scanner(System.in);
        System.out.print("Up = 1\nLover = 2\nLeft = 3\nRight = 4\nExit = 0\nInput: ");
        int n = 0;
        do {
            n = in.nextInt();
            switch (n) {
                case 1:
                    moveUp(matrix);
                    break;
                case 2:
                    moveLover(matrix);
                    break;
                case 3:
                    moveLeft(matrix);
                    break;
                case 4:
                    moveRight(matrix);
                    break;
            }
            printMatrix(matrix);
        } while (n != 0);
    }

    public static void moveUp(int[][] matrix) {
        int n = howMuchMove(matrix);
        for (int k = 0; k < n; k++) {
            int[] tmp = matrix[0];
            for (int i = 0; i < matrix.length - 1; i++)
                matrix[i] = matrix[i + 1];
            matrix[matrix.length - 1] = tmp;
        }
    }

    private static void moveLover(int[][] matrix) {
        int n = howMuchMove(matrix);
        for (int k = 0; k < n; k++) {
            int[] tmp = matrix[matrix.length - 1];
            for (int i = matrix.length - 1; i > 0; i--)
                matrix[i] = matrix[i - 1];
            matrix[0] = tmp;
        }
    }

    public static void moveLeft(int[][] matrix) {
        int n = howMuchMove(matrix);
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < matrix.length - 1; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    int tmp = matrix[j][i];
                    matrix[j][i] = matrix[j][i + 1];
                    matrix[j][i + 1] = tmp;
                }
            }
        }
    }

    public static void moveRight(int[][] matrix) {
        int n = howMuchMove(matrix);
        for (int k = 0; k < n; k++) {
            for (int i = matrix.length - 1; i > 0; i--) {
                for (int j = 0; j < matrix.length; j++) {
                    int tmp = matrix[j][i];
                    matrix[j][i] = matrix[j][i - 1];
                    matrix[j][i - 1] = tmp;
                }
            }
        }
    }

    public static int howMuchMove(int[][] matrix) {
        System.out.println("how mush move");
        Scanner in = new Scanner(System.in);
        return in.nextInt() % matrix.length;
    }
}

