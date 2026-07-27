package com.rahul.dsa.basics;

public class Loops {
    static void main(String[] args) {
        System.out.println("Loops in Java");

//        sample code for loop syntax
        for(int i =1; i<=5; i++){
            System.out.println("Rahul");
        }
// for loop for printing the odd number
        for (int i = 1; i <=10; i+=2) {
            System.out.println(i);
        }
        System.out.println("printing even & odd numbers");
//        for loop for printing the even number
        for (int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }
// Nested loop

        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <=3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
        }
    }

}
