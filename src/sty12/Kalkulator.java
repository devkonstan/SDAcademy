package sty12;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę 1: ");
        int a = sc.nextInt();
        System.out.println("podaj liczbę 2: ");
        int b = sc.nextInt();
        System.out.println("wybierz działanie: ");
        char znak = sc.next().charAt(0);

        if (znak == '+') {
            Operacje.dodaj(a, b);
        } else if (znak == '-') {
            Operacje.odejmij(a, b);
        } else if (znak == '*') {
            Operacje.przemnoz(a, b);
        } else if (znak == '/') {
            Operacje.podziel(a, b);
        } else if (znak == '%')
            Operacje.reszta(a, b);
    }

}

