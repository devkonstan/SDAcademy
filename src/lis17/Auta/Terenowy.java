package lis17.Auta;

public class Terenowy extends Samochod {
    String duzoBiegow="duzo biegow";

    public Terenowy() {
        liczbaDrzwi=5;
    }

    void podwyzszamZawieszenie(){
        System.out.println("podnosze zawieszenie");
    }


    void jadeWszedzie() {
        podwyzszamZawieszenie();
        zamykamWszystkieDrzwi();
        zapinamPasy();
        odpalamSilnik();
        jazdaJazda();
    }

    @Override
    public String toString() {
        return "pokonuje przeszkody";
    }
}


