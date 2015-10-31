package com.company;

/**
 * Created by HoreaGinsca20 on 25/10/2015.
 */
import java.util.Scanner;
public class PrintNumberInWord {
    public static void main (String [] args) {
        int a = 1;
        do {
            Scanner in = new Scanner(System.in);
            a = in.nextInt();


            if (a == 1) {
                System.out.println("ONE");
            } else if (a == 2) {
                System.out.println("TWO");
            } else {
                System.out.println("Any Other number");
            }
        }while (a!=0);
        switch(a) {
            case 1:
                System.out.println("One"); break;
            case 2:
                System.out.println("TWO"); break;
            default:
                System.out.println("OTHER");
        }
    }
}
