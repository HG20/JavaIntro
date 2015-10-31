package com.company;

import java.util.Scanner;

/**
 * Created by HoreaGinsca20 on 25/10/2015.
 */

import java.util.Scanner;
public class CheckOddEven {
    public static void main(String[] args) {

        int x;
        System.out.println("Enter an integer to check if it is odd or even");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if ( x % 2 ==0 )
        System.out.println("You entered an even number");
        else
        System.out.println("You entered an uneven number");
    }
}




