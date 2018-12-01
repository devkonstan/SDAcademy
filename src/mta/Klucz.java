package mta;

public class Klucz {
    private int rozmiar;

    private Klucz(int rozmiar) {
        this.rozmiar=rozmiar;
    }

    public static Klucz podajKlucz(int rozmiar) {
        return new Klucz(rozmiar);
    }
}
