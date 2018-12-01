package list17;

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
        zapinamPasy();
        zamykamWszystkieDrzwi();
        odpalamSilnik();
        jazdaJazda();

    }

    @Override
    public String toString() {
        return "pokonuje przeszkody";
    }
}


