package ZadDom;

import java.util.Scanner;

public class zad07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę całkowitą +: ");
        int liczba=sc.nextInt();

        for (int i = 1; i <= liczba; i=i+2) {
            System.out.println(i);;

        }
    }
}

