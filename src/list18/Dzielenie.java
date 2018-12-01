package list18;

public class Dzielenie implements Operacja {

    @Override
    public double wykonajOperacje(double liczba1, double liczba2) {
        double wynik = liczba1 / liczba2;
        if (liczba2==0) {
            System.out.println("nie mozna robic takich rzeczy!");
        return 0;
        } else {
            return wynik;
        }

    }
}
