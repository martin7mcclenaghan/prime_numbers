package com.martinmcclenaghan;

public class Main {

    public static void main(String[] args) {

        // write a method that prints prime numbers within a given range
        // Next write a method that determines whether a number is a prime number
        // Then write the tests for both
        // prime numbers are divisible by themselves and 1


        System.out.println(isPrime(5));
        System.out.println(isPrime(9));
        System.out.println(isPrime(25));
        System.out.println(isPrime(169));




    }

    public static void primePrinter(int start, int end) {

        if (start < 1) {
            System.out.println("Invalid Range - Prime numbers must be 1 or greater.");
        } else if (end >= start) {
            System.out.println("End must be greater than start.");
        } else {

            for (int i = start; i <= end; i++) {






            }
        }
    }

    public static boolean isPrime (int n) {

       for (int i = 2; i <= n/2; i++){

            if (n % i == 0){

                return false;
            }
        }

        return true;
    }

}
