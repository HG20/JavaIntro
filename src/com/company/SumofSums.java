package com.company;

/**
 * Created by HoreaGinsca20 on 25/10/2015.
 */
import java.util.Scanner;

public class SumofSums {


    public static void main(String[] args) {
        int n = 5478;

        int sum = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            sum += lastdigit;
            n /= 10;
        }
        System.out.println(sum);


    }

}
