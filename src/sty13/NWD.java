package sty13;

import java.util.Scanner;

public class NWD {
    public static void main(String[] args) {
        int a, b, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę a: ");
        a = sc.nextInt();
        System.out.println("podaj liczbę b: "); //dzielnik
        b = sc.nextInt();


        while (b != 0) {
            t=b;
            b=a%b;
            a=t;
        }
        System.out.println("wartosc a wynosi: " + a);
        //stop
    }
}

