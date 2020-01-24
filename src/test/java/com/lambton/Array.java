package com.lambton;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void displayReverseArray() {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i] + " ");
        }
    }

    public static void stringArrayHandling()
    {
        String str[];
        String rev[];
        str = new String[10];
        str[0] = "canada";
        str[1] = "india";
        str[2] = "nepal";
        str[3] = "toronto";
        str[4] = "shree";
        str[5] = "shawn";
        str[6] = "goofy";
        str[7] = "mikey";
        str[8] = "rocky";
        str[9] = "rambo";

        for (int i = 0; i < str.length; i++)
        {
            String rev = reverseString(str[i]);
            System.out.println(str[i] + "<->"+ rev);
        }
    }
    public static String reverseString(String s)
    {
        String temp;
        char names[] = s.toCharArray();
        int len = names.length;
        for( int i=0; j=len -1; i < len/2; i++,j--)

    }

    public static void main(String[] args) {
        int a[];
        int[] b;
        int c[] = new int[5];
        c[0] = 10;
        c[1] = 20;
        c[2] = 30;
        c[3] = 40;
        c[4] = 50;
        //c[5]=60;

        int d[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("length of Array :" + d.length);
        System.out.println("c output" + c[4]);

        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }

        int[] x1, y1;//both are array
        int x2, y2[];//1 - int ,2 - Array
        int x3[], y3;// 1- Array,2 - int
        int[] x4, y4[];// x4 - 1D array, y4 - 2D array

        y4 = new int[3][3];
        System.out.println("using compact for(:)");
        for (int p : d) {
            System.out.println(p);
        }
    }

    /*
    Create an array of n integer element and find the sum,avg,min and max
     */
    public static void findArray() {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max, min, sum;
        float avg;
        sum = 0;
        max = a[0];
        min = a[0];

        for (int x : a) {
            sum = sum + x;  //sum += x;

            if (min > x) {
                min = x;
            }
            if (max < x) {
                max = x;
            }
        }

        avg = sum / a.length;
        {

            System.out.println("MIN " + min + "\nMax" + max + "\navg" + avg + "\nsum" + sum);
        }

    }
}






