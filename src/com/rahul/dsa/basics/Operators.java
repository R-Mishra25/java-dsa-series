package com.rahul.dsa.basics;

public class Operators {
    static void main() {

        // some operators are :
            // 1. Arithmetic operators
            // 2. Relational operators
            // 3. Logical operators
            // 4. Assignment operators
            // 5. Unary inc/dec operators
            // 6. Bitwise operators


        // Arithmetic operators

        // if int/int result will be always int


        int solvedThisWeek = 35;
        int solvedLastWeek = 10;

        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedLastWeek;
        int projected =  solvedThisWeek * 4;
        int average = solvedThisWeek / 7;
        int remainder = solvedThisWeek % 7;

        System.out.println(total); // 45
        System.out.println(difference); // 25
        System.out.println(projected); //  140
        System.out.println(average); // 5
        System.out.println(remainder); // 0



        // Relational operators

        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println(currentStreak == targetStreak); // false
        System.out.println(currentStreak != targetStreak); // true
        System.out.println(currentStreak > targetStreak); // false
        System.out.println(currentStreak < targetStreak); // true
        System.out.println(currentStreak <= targetStreak); // true
        System.out.println(currentStreak >= targetStreak); // false

        // Logical operators => always apply on conditions or true/false


//        Logic behind the operators


        // True && True = True
        // True && False = False
        // False && True = False
        // False && False = False

        // True || True = True
        // True || False = True
        // False || True = True
        // False || False = False

        // !True  = False
        // !False = True



        boolean completedDSA = true;
        boolean completedCore = false;

        System.out.println(completedCore && completedDSA);  // false
        System.out.println( completedCore || completedDSA); // true
        System.out.println(!completedCore);                 // true


        //  Assignment operators
        int ratingPoints = 100;

        ratingPoints += 20; // ratingPoints = ratingPoints + 20
        System.out.println(ratingPoints); // 120
        ratingPoints -= 10; // ratingPoints = ratingPoints - 10
        System.out.println(ratingPoints); // 110
        ratingPoints *= 2; // ratingPoints = ratingPoints * 2
        System.out.println(ratingPoints); // 220
        ratingPoints /= 4; // ratingPoints = ratingPoints / 4
        System.out.println(ratingPoints); // 55
        ratingPoints %=30; // ratingPoints = ratingPoints % 30
        System.out.println(ratingPoints); // 25

//        Unary inc/dec operators

        int activeUsers = 100;
        int prefix = ++activeUsers;
        int postfix = activeUsers++;
        System.out.println(prefix);  // 101
        System.out.println(postfix); // 101
        System.out.println(activeUsers); // 102

//         Bitwise operators

        int a = 5;  // 0101
        int b = 3;  // 0011

        System.out.println(a & b);  // 1
        System.out.println(a | b);  // 7
        System.out.println(a ^ b);  // 6
        System.out.println(~a);   // -6
        System.out.println(a << 1);  // 10
        System.out.println(a >> 1);  // 2

    }

}
