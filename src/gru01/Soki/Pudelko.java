package gru01.Soki;

public class Pudelko<S extends Sok> { //definiujemy wlasny typ danych w tym Arbuzowy, Pomaranczowy
    public S soczek;

    public Pudelko(S soczek) { //konstruktor

        this.soczek = soczek;
    }

    public void nalej() { //metoda

        System.out.println("nalewam sok " + soczek.getClass().getSimpleName());
    }
}
