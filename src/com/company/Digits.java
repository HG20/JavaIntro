package com.company;

/**
 * Created by HoreaGinsca20 on 25/10/2015.
 */
public class Digits {
    public static void main (String [] args) {
        int number =64321;
        int length  = (int) Math.log10(number) + 1;
        System.out.println(length);
    }
}
