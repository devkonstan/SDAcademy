package ZadDom;

import java.util.Scanner;

public class zad301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liczba;
        //rozpoznaj znak - przed liczba, ale co gdy brak go?
        //czy jest jakas wbudowana metoda do tego?
        //String->Next->charAt(0)
        System.out.println("podaj liczbę dodatnią lub ujemną: ");
        liczba = sc.nextInt();
        if (liczba > 0) {
            System.out.println(liczba + " jest dodatnia");
        } else if (liczba < 0) {
            System.out.println(liczba + " jest ujemna");
        } else {
            System.out.println(liczba + " nie jest ani dodatnie ani ujemne");
        }

    }
}
