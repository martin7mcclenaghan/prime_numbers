package com.martinmcclenaghan;

public class Main {

    public static void main(String[] args) {

        // Method below prints prime numbers within a given range.
        // Utilises method isPrime () also below for which two test classes have been included.
        // Prime numbers are only divisible by themselves and 1 and are integers greater than 0.


        System.out.println(isPrime(5));
        System.out.println(isPrime(9));
        System.out.println(isPrime(25));
        System.out.println(isPrime(169));

        primePrinter(10,50);




    }

    public static void primePrinter(int start, int end) {

        if (start < 1) {
            System.out.println("Invalid Range - Prime numbers must be 1 or greater.");
        } else if (end <= start) {
            System.out.println("Invalid Range - End must be greater than start.");
        } else {

            for (int i = start; i <= end; i++) {

                if (isPrime(i)){
                    System.out.println(i + " is a prime number");
                }
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
