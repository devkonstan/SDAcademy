package Operacje;

public class Odejmowanie {

    private double roznica;

    public double pobierzLiczby(double liczba1, double liczba2) {
        roznica = liczba1 - liczba2;
        return roznica;
    }

    public void wyswietlWynik() {
        System.out.println(roznica);
    }
}