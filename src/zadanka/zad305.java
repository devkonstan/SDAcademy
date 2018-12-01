package zadanka;

import java.util.Scanner;

public class zad305 {
    public static void main(String[] args) {
        float a;
        float b;

        Scanner sc=new Scanner(System.in);
        System.out.println("podaj 1 liczbę:");
        a=sc.nextFloat();
        System.out.println("podaj 2 liczbę");
        b=sc.nextFloat();

        if (a==b) {
            System.out.println("liczby są jednakowe");
        } else {
            System.out.println("nie są jednakowe");
        }
    }

}
