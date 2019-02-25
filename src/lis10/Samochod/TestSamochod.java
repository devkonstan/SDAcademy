package lis10.Samochod;

import java.util.Scanner;

public class TestSamochod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Samochod audi = new Samochod();
        System.out.println(audi.kolor);
        System.out.println(audi.silniczek.pojemnosc);

        Samochodzik autko=new Samochodzik("red",new Silnik(34),4,8);
        System.out.println(autko.silnik.pojemnosc);

        System.out.println("podaj kolor auta: ");
        Samochod mercedes = new Samochod(sc.next());

        System.out.println("podany kolor: " + mercedes.kolor);

        System.out.println("podaj pojemnosc: ");
        Silnik engine = new Silnik(sc.nextInt());

        System.out.println("podana przez uzytkownika pojemnosc: " + engine.pojemnosc);
        System.out.println("domyslna wartosc: " + mercedes.silniczek.pojemnosc);

    }
}
