package sty12;

import java.util.Scanner;

public class zad02 {
    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj 1 liczbę: ");
        a = sc.nextInt();
        System.out.println("podaj 2 liczbę: ");
        b = sc.nextInt();

        if (a>10 && b<4) {
            System.out.println("opcja 1");
        }
        else if (a<6 && (b>=5 || b<1)) {
            System.out.println("opcja 2");
        }
        else {
            System.out.println("opcja 3");
        }
    }
}