package com.company;

import java.util.Scanner;

/**
 * Created by HoreaGinsca20 on 25/10/2015.
 */
public class CheckOddEven2 {
    public static void main(String[] args) {
        int c;
        System.out.println("Input an integer:");
        Scanner in = new Scanner (System.in);
        c = in.nextInt();

        if ( (c/2)*2 == c )
            System.out.println("Even");
        else
            System.out.println("Odd");

    }
}

