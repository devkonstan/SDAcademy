package gru01.Samochody;

public class Warsztat<S extends Samochod> {
    public S samochod;

    public Warsztat(S sam) {

        this.samochod = sam;
    }

    //konstruktor bez-argumentowy
    public Warsztat() {

    }

    public void napraw() {

        System.out.println("naprawiam " + samochod.getClass().getSimpleName());
    }
}
