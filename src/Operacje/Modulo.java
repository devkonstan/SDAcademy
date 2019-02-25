package Operacje;

public class Modulo {
    private double modul;

    public double pobierzLiczby(double liczba1, double liczba2) {

        if (liczba2 == 0) {
            System.out.println("nie dzielimy przez 0!");
            return 0;
        } else {
            modul = liczba1 % liczba2;
            return modul;
        }
    }

    public void wyswietlWynik() {
        System.out.println(modul);
    }

}
