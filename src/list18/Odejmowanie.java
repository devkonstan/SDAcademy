package list18;

public class Odejmowanie implements Operacja {

    @Override
    public double wykonajOperacje(double liczba1, double liczba2) {
        double wynik = liczba1 - liczba2;
        return wynik;
    }

//    public void wyswietlWynik(double liczba1, double liczba2){
//        System.out.println(liczba1-liczba2);
//    }
}
