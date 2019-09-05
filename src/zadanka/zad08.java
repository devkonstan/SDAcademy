package zadanka;

import java.util.Scanner;

public class zad08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj 1 liczbę całkowitą: ");
        int liczbaA = sc.nextInt();
        System.out.println("podaj 2 liczbę całkowitą większą od poprzedniej: ");
        int liczbaB = sc.nextInt();
        int sumaWhile = 0;
        int sumaDo = 0;
        int sumaFor = 0;

        int liczbaA1 = liczbaA;
        int liczbaA2 = liczbaA;

        while (liczbaA <= liczbaB) {
            sumaWhile = sumaWhile + liczbaA;
            liczbaA++; //dlazego po wyjsciu z petli nie resetuje tej zmiennej?
        }
        System.out.print(sumaWhile + " ");

        do {
            sumaDo = sumaDo + liczbaA1;
            liczbaA1++;
        } while (liczbaA1 <= liczbaB);
        System.out.print(sumaDo + " ");

        for (int i = liczbaA2; i <= liczbaB; i++) {
            sumaFor = sumaFor + liczbaA2;
            liczbaA2++;
        }
        System.out.print(sumaFor + " ");
    }
}