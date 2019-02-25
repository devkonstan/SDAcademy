package sty13;

import java.util.Scanner;

public class FunkcjaLiniowa {
    public static void main(String[] args) {
        double a, b, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę a: ");
        a = sc.nextDouble();
        System.out.println("podaj liczbę b: "); //dzielnik
        b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("nieskonczenie wiele miejsc zerowych");
            } else {
                System.out.println("brak miejsc zerowych");
            }
        } else {
            System.out.println("miejsce zerowe wynosi: "+(-b/a));
        }
    }
}