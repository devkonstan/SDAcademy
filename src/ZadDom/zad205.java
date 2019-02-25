package ZadDom;

import java.util.Random;
import java.util.Scanner;

public class zad205 {
    public static void main(String[] args) {
        int cenaZaLitr = 2;
        double paliwo;
        double losowaDolewka;
        double sumaPaliwo = 0;
        double sumaLosowaDolewka = 0;
        char odp;
        Random randomek = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("ile paliwa nalać?");
        paliwo = sc.nextDouble();
        sumaPaliwo = sumaPaliwo + paliwo;

        do {
            System.out.println("nalewać dalej? [t] lub [n]: ");
            odp = sc.next().charAt(0);
            if (odp == 'n') break;
            System.out.println("jaką ilość dolać?");
            paliwo = sc.nextDouble();
            sumaPaliwo = sumaPaliwo + paliwo;

            losowaDolewka = Math.round(10 * (randomek.nextDouble()));
            System.out.println("losowa dolewka: " + losowaDolewka);
            sumaLosowaDolewka = sumaLosowaDolewka + losowaDolewka;
        } while (odp == 't');

        System.out.println("cena za litr wynosi: " + cenaZaLitr + " zł");
        System.out.println("SPRAWOZDANIE:");
        System.out.println("wlano " + sumaPaliwo + " litrów paliwa");
        System.out.println("koszt paliwa: " + cenaZaLitr * sumaPaliwo + " zł");
        System.out.println("losowa ilosc dolanego paliwa to: " + sumaLosowaDolewka + " litrów");
        System.out.println("koszt losowej ilosci wynosi " + cenaZaLitr * sumaLosowaDolewka + " zł");
        System.out.println("łączny koszt tankowania: " + cenaZaLitr * (sumaLosowaDolewka + sumaPaliwo) + " zł");
    }
}