package com.rahul.dsa.arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner lc = new Scanner(System.in);

        System.out.print("Enter the length of the array  : ");

        // taking length in input from user
        int len = lc.nextInt();

        int arr[] = new int[len];

        // taking values in input from user
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value of index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // separator

        System.out.println();

        // printing the values of the array

        for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
        }

        // for-each loop
        int index = 0;

        for (int i : arr) {
        System.out.println("Value of index " + index + ": " + i);
        index++;
        }

        // printing length of the array
        System.out.println("length of the array : " + len);

        // scanner api closes

        sc.close();
        lc.close();

        // sum of the values of the array

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of the values of the array : " + sum);

        //  product of elements in a array 
        int multiply = 1;

        for (int i = 0; i < arr.length; i++) {
            multiply *= arr[i];
        }
        System.out.println("Product of the values of the array : " + multiply);

        // maximum value of the array

        int maxValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }

        }
        System.out.println("Maximum value :" + maxValue);
        


        // minimum value of the array

        int minValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("Minimum valuue :" + minValue);

    }
}
 