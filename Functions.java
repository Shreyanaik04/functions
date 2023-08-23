package com.Shreya;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: "); //use to take input from user
        int n = in.nextInt();
        boolean ans =  allArm(); // for isPrime replace allArm() with isPrime()
        System.out.println(ans);
    }

    //    Check if a number is Armstrong number or not
    static boolean isArm(int n){
        int og = n;
        int ans = 0;
        while (n>0){
            int rem = n%10;
            ans = rem*rem*rem +ans;
            n=n/10;
        }
        return og == ans;
    }

    //    Print all 3 digit Arm strong numbers
    static boolean allArm(){
        int n = 0;
        for ( n = 100; n <1000 ; n++) {
            if (isArm(n)){
                System.out.println(n);
            }
        }
        return true;
    }

    //    Check if a number is prime number or not
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c*c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}