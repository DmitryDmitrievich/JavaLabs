package lab1;

import java.util.Scanner;
import java.util.Random;

public class MyClass {
    final static int SIZE_RANDOM = 10;

    public static void main(String args[]) {
        int type = typeInput();
        int[][] array = createMatrix();
        fillMatrix(array, type);
        printMatrix(array);
        System.out.println("Max = " + maxValue(array));
        System.out.println("Min = " + minValue(array));
        System.out.println("Sum = " + sumValue(array));
    }

    public static int typeInput() {
        Scanner read = new Scanner(System.in);
        int type;
        do {
            System.out.println("Write type 1 or 2: ");
            while (!read.hasNextInt()) {
                System.out.println("That not a number!");
                read.next();
            }
            type = read.nextInt();
        } while (type != 1 & type != 2);
        return type;
    }

    public static int[][] createMatrix() {
        Scanner read = new Scanner(System.in);
        int n = 0;
        int m = 0;
        do {
            System.out.println("Strings:");
            n = read.nextInt();
            System.out.println("Columns:");
            m = read.nextInt();
            check(n, m);
        } while (n < 0 || m < 0 || n == m);
        int[][] arr = new int[n][m];
        return arr;
    }

    public static void check(int i, int j) {
        if (i < 0 || j < 0) {
            System.out.println("Error, try again");

        }
        if (i == j) {
            System.out.println("Error, try again");

        }

    }

    public static int[][] fillWithKeyboard(int[][] arr) {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Element [" + (i + 1) + "][" + (j + 1) + "] :");
                arr[i][j] = read.nextInt();
            }

        }
        return arr;
    }

    public static int[][] fillWithRandom(int[][] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(SIZE_RANDOM) + 1;
            }
        }
        return arr;
    }

    public static int[][] fillMatrix(int[][] arr, int name) {
        if (name == 1) {
            fillWithKeyboard(arr);
        } else {
            fillWithRandom(arr);
        }
        return arr;
    }

    public static void printMatrix(int[][] arr) {
        System.out.println("Matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int maxValue(int[][] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int minValue(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    public static int sumValue(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}