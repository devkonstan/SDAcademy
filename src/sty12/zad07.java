package sty12;

import java.util.Scanner;

public class zad07 {
    public static void main(String[] args) {
        double[] doubles = new double[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = sc.nextDouble();
        }

        for (int i = 0; i < doubles.length; i++) {
            System.out.printf("%.2f"+" ", doubles[i]);
        }
    }
}
