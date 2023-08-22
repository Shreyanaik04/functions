package com.Shreya;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = in.nextInt();
        isArm(n);
    }
    static void isArm(int n){
        int rem ,num , ans = 0;
        num = n;
        if(n>99 & n<1000){
            while (n!=0){
                rem = n%10;
                ans = rem*rem*rem + ans ;
                n= n/10;
            }
            if (ans==num){
                System.out.println(num + " is a armstrong number");
            }else {
                System.out.println(num + " is not a armstrong number");
            }
        }else {
            System.out.println("Please enter 3 digit number!!");
        }
    }

}
