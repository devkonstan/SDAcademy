package list18;

public interface Operacja {

    public abstract double wykonajOperacje(double liczba1, double liczba2);

    //default konieczne w klasie zamienionej na interfejs
    default void wyswietlWynik(double liczba1, double liczba2){
        double wynikOperacji=wykonajOperacje(liczba1,liczba2);
        System.out.println(wynikOperacji);
    }

}
