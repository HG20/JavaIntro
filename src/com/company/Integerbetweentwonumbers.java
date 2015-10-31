package com.company;

/**
 * Created by HoreaGinsca20 on 29/10/2015.
 */
import java.util.Scanner;
public class Integerbetweentwonumbers {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int nr=in.nextInt();
        System.out.println("Introduce number:"+ nr);
        int first=9;
        int second=24;

        if (first < nr <<second)
            System.out.println("True");
        else {
            System.out.println("False");;

        }
    }
}


