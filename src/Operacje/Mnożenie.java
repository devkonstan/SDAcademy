package Operacje;

public class Mnożenie {
private double iloczyn;
    public double mnozymy(double liczba1, double liczba2) {
        iloczyn=liczba1*liczba2;
        return iloczyn;
    }

    public void wyswietlWynik() {
        System.out.println(iloczyn);
    }
}
