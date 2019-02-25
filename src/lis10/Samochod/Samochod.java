package lis10.Samochod;

public class Samochod {
    String kolor;
    Silnik silniczek;

    Samochod(String kolorek) {
        kolor = kolorek;
        silniczek = new Silnik();
    }

    Samochod() {
        this("czarny");
    }


}
