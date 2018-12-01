package zadanka;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę: ");
        int liczba = sc.nextInt();
        int suma=0;
        suma=suma+liczba;
        //czy to mozna zrobic przy uzyciu tablicy? co z deklarowaniem elementow?
        while (liczba!=0) {
            System.out.println("podaj liczbę: ");
            liczba = sc.nextInt();
            suma=suma+liczba;
        }
        System.out.println(suma);
    }
}
