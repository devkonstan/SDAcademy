package ZadDom;

import java.util.Scanner;

public class zad306 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę: ");
        int liczba = sc.nextInt();
        double suma = 0;
        int licznik = 1;
        suma = suma + liczba;
        double srednia;
        while (licznik < 5) {
            System.out.println("podaj liczbę: ");
            liczba = sc.nextInt();
            suma = suma + liczba;
            licznik++;
        }
        srednia=suma/5;
        System.out.println("suma wynosi: "+suma);
        System.out.println("średnia wynosi: "+srednia);
    }
}