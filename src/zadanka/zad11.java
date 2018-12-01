package zadanka;

import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liczba;
        int min;
        int max;
        int sumaMaxMin;
        double srednia;
        System.out.println("podaj liczbę: ");
        liczba = sc.nextInt();
        min = liczba;
        max = liczba;

        while (liczba!=0) {
            System.out.println("podaj liczbę: ");
            liczba = sc.nextInt();

            if (liczba==0){
                break;
            }

            if (liczba < min) {
                min = liczba;
            }

            if (liczba > max) {
                max=liczba;
            }
        }


        sumaMaxMin = min + max;
        srednia = (double) (min + max) / 2;

        //wyswietla sume max i min
        System.out.println("suma max i min to: "+sumaMaxMin);
        //wyswietla sr arytmetyczna liczb
        System.out.println("srednia tych liczb wynosi: "+srednia);
    }
}



