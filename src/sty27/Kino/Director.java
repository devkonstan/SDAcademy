package sty27.Kino;

public class Director {
    String imie;
    String nazwisko;
    String gatunek;

    @Override
    public String toString() {
        return "Director{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", gatunek='" + gatunek + '\'' +
                '}';
    }

    public Director(String imie, String nazwisko, String gatunek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.gatunek = gatunek;
    }
}
