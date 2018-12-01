package zadanka;

import java.util.Scanner;

public class Pracownik {
    public int wiek;
    public String pesel;
    public enum Plec {m, k}
    Plec plec;

    public Pracownik(String pesel, Plec plec, int wiek) {
        this.pesel = pesel;
        this.plec= plec;
        this.wiek = wiek;
    }

}

