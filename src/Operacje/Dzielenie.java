package Operacje;

public class Dzielenie {
    private double iloraz;

    public double dzielimy(double liczba1, double liczba2) {
        iloraz=liczba1/liczba2;
        if (liczba2 == 0) {
            System.out.println("nie dzielimy przez 0!");
            return 0;
        } else {
            return iloraz;
        }
    }

    public void wyswietlWynik() {
        System.out.println(iloraz);
    }
}
