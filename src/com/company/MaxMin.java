package com.company;

/**
 * Created by HoreaGinsca20 on 25/10/2015.
 */
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int num =in.nextInt();
        int max= num %10, min = num % 10;
        while(num > 0) {
            int a = num % 10;
            if (a > max) max = a;
            if (a < min) min = a;
            num = num / 10;
        }
        System.out.println("Max :"+ max);
        System.out.println("Min :"+min);
    }
}

