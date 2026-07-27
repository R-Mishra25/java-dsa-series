package com.rahul.dsa.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Loops in Java");

        // sample code for loop syntax
        for (int i = 1; i <= 5; i++) {
            System.out.println("Rahul");
        }
        // for loop for printing the odd number
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("printing even & odd numbers");
        // for loop for printing the even number
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        // Nested loop

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
        }

        // break keyword => if i want to break the loop at a certain condition then i
        // will use break keyword

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        // continue keyword => if i want to skip an entire iteration then i will use
        // continue keyword

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        
        // while loop

        int i =1;
        while (i<=5) {
            System.out.println(i);
            i++;
        }
        // do while loop

        do {
            System.out.println("dowhile loop"+i);
            i++;
        } while (i<1);

        //  Home work on loop


        // 1. Print counting from 1 to n

        // 2. Print counting from n to 1

        // 3. Print the 10 mutilples of n

        // 4. Print yoour name 100 times

        // 5. Print all prime number from 1 to 100

        // 6. Print all even number from 1 to 100

        // 7. Print the sum of all the numbers from 1 to n

        // 8. Print all integers in range 50 to 100 , that are perfectly divisible by 7 

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = Input.nextInt();


        for (int a = 1; a <=number ; a++) {
            System.out.println(a);
        }


        for (int b = number; b >= 1; b--) {
            System.out.println(b);
        }

        for (int c = 1; c <= 10; c++) {
            System.out.println(number * c);
        }

        for (int d = 1; d <=100; d++) {
            System.out.println(d+" Rahul Mishra");
        }

        System.out.print("Prime numbers from 1 to 100: ");
        for (int num = 1; num <= 100; num++) {
            int count = 0;
            // Check divisibility from 2 to number/2
            for (int m = 2; m <= num / 2; m++) {
                if (num % m == 0) {
                    count++;
                    break;
                }
            }
            // 1 is not prime, so we check count == 0 AND number != 1
            if (count == 0 && num != 1) {
                System.out.print(num + " ");
            }   
        System.out.println();
        }
        
        int y = 1;
        while (y<=100) {
        if (y%2==0) {
            System.out.println(y);
            
        }   
        y++; 
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter n: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        
        // Print the summation expression (e.g., 1+2+3+)
        for (int k = 1; k < n; k++) {
            System.out.print(k + "+");
            sum += k;
        }
        
        // Add the last number and print the equals sign and result
        sum += n;
        System.out.print(n + "=" + sum);
        System.out.println(); // New line at the end


        System.out.println("Integers in range 50 to 100 that are perfectly divisible by 7:");

        for (int f = 50; f <= 100; f++) {
            if (f % 7 == 0) {
                System.out.print(f + " ");
            }
        }

        
    }
}
