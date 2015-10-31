package com.company;

/**
 * Created by HoreaGinsca20 on 30/10/2015.
 */
import java.util.Scanner;
public class Practice8 {


        public static boolean between(int n, int lower, int upper) {
            return n>=lower && n<=upper;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n, lower, upper;
            System.out.print("Enter number: ");
            n = scan.nextInt();
            System.out.print("Enter lower boundary: ");
            lower = scan.nextInt();
            System.out.print("Enter upper boundary: ");
            upper = scan.nextInt();
            if (between(n, lower, upper)) {
                System.out.println("The number is between lower and upper limits.");
            } else {
                System.out.println("The number is outside the limits.");
            }
        }

    }

