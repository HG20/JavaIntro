package com.company;

/**
 * Created by HoreaGinsca20 on 25/10/2015.
 */
import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter number");
        int a = 64321, result = 1;
        for (int i = keyboard.nextInt(); i != 0; a = i % 10, i /= 10)
            result *= a;
        System.out.println(result);
    }
}
