package lis18.Operacja;

public interface Operacja {
    //public abstract domyslnie
    double wykonajOperacje(double liczba1, double liczba2);

    //default konieczny w klasie zamienionej na interfejs
    default void wyswietlWynik(double liczba1, double liczba2) {
        System.out.println(wykonajOperacje(liczba1, liczba2));
    }

}
