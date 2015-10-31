package com.company;

/**
 * Created by HoreaGinsca20 on 24/10/2015.
 */
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        //System.out.println("Dati numaru de numere a caror medie doriti sa o aflati:");
        int howMany = 0;
        int sum = 0;
        int nr;
        float med;

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Numar: ");
            nr = in.nextInt();

            sum = sum + nr;
            howMany++;
        }
        while (nr != -1);


        if (nr != -1 && howMany == 1) {
            med = sum / howMany;
            System.out.println("Media este" + med);
        } else {
            System.out.println("Ati introdus direct -1.");
        }
    }
}



