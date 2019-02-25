package ZadDom;

import java.util.Scanner;

public class Firma {
    //fajnie jakby pracwnicy tworzyli sie w tablicy a dane wczytywane byly przez scanner
    public static void main(String[] args) {
        int wiek;
        String pesel;
        Pracownik.Plec plec;

        Scanner sk = new Scanner(System.in);
        //tworzyc w petli pracownikow i potem pola takze ->paz27.TestTablicy 2wymiarowa
        System.out.println("podaj pesel pracownika(11 cyfr): ");
        pesel = sk.next();
        System.out.println("podaj plec pracownika: m albo k");
        plec = Pracownik.Plec.valueOf(sk.next());
        System.out.println("podaj paz27.Wiek pracownika: ");
        wiek = sk.nextInt();

        Pracownik robol = new Pracownik(pesel, plec, wiek);
        System.out.println(robol.pesel+" "+robol.plec+" "+robol.wiek);
    }
}