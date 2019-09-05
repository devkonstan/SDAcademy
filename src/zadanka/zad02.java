package zadanka;

import java.util.Scanner;

public class zad02 {
    public static void main(String[] args) {
        //pewnie da sie wczytac te liczby jednym ciurkiem
        //mozna zapewne tez zrobic liste
        Scanner sc = new Scanner(System.in);
        int max;
        int min;
        int liczba;
        int ilosc = 3;
        System.out.println("podaj " + 1 + " liczbę: ");
        min = sc.nextInt();
        max = min;
        for (int i = 2; i <= ilosc; i++) {
            System.out.println("podaj " + i + " liczbę: ");
            liczba = sc.nextInt();
            if (max < liczba) max = liczba;
            if (liczba < min) min = liczba;
        }
        System.out.println("najwieksza liczba to: " + max);
        System.out.println("najmniejsza liczba to: " + min);
    }
}
