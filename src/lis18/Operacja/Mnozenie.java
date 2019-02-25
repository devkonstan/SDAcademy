package lis18.Operacja;

public class Mnozenie implements Operacja {

    @Override
    public double wykonajOperacje(double liczba1, double liczba2) {
        double wynik = liczba1 * liczba2;
        return wynik;
    }
}
