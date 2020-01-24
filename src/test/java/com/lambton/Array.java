package com.lambton;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int a[];
        int[] b;
        int c[] = new int[5];
        c[0] = 10;
        c[1] = 20;
        c[2] = 30;
        c[3] = 40;
        c[4] = 50;
        System.out.println(c[4]);

        a = new int[2];
        a[0] = 100;
        a[1] = 200;
        System.out.println(a[0]);

        int d[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(d[4]);
        System.out.println(d.length);

        System.out.println("Using for(;;)");
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }

        int[] x, y; //Both are array
        int x2, y2[]; // 1 - int, 2 - array
        int x3[], y3; //1 - array, 2 - int
        int[] x4, y4[]; // 1 - array, 2 - 2D array

        y4 = new int[3][3];
        y4[0][0] = 1;
        y4[0][1] = 2;
        y4[0][2] = 4;
        y4[1][0] = 5;
        y4[1][1] = 6;
        y4[1][2] = 7;
        System.out.println(y4[0][1]);

        System.out.println("Using Compact for(:)");
        for (int p : d) {
            System.out.println(p);
        }

        // Class Assignment
        System.out.println(" ");
        System.out.println("Class Assignment");
        int e[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Display all values of array");
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }

        System.out.println("Display sum value from array");
        int sum = 0;
        int min = e[0];
        int max = e[0];
        float avg = 0;

        for (int j : e) {
            sum += j;
        }
        System.out.println("Sum:" + sum);

        avg = (float) sum / e.length;
        System.out.println("Avg:" + avg);

        for (int k = 0; k < e.length; k++) {
            if (max < e[k]) {
                max = e[k];
            }
        }
        System.out.println("Maximum value from array: " + max);

        for (int k = 0; k < e.length; k++) {
            if (min > e[k]) {
                min = e[k];
            }
        }
        System.out.println("Minimum value from array: " + min);
    }

}

