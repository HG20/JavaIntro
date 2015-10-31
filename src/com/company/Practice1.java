package com.company;

/**
 * Created by HoreaGinsca20 on 25/10/2015.
 */
public class Practice1 {
    public static void main (String [] args) {
        int a = 64321;
        int sum = 0;
        while (a > 0) {
            sum = sum + a % 10;
            a = a / 10;
        }
        System.out.println(sum);

    }
}



