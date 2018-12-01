package Operacje;

public class Modulo {
    private double modulek;

    public double modulujemy(double liczba1, double liczba2) {

        if (liczba2 == 0) {
            System.out.println("nie dzielimy przez 0!");
            return 0;
        } else {
            modulek = liczba1 % liczba2;
            return modulek;
        }
    }

    public void wyswietlWynik() {
        System.out.println(modulek);
    }

}
