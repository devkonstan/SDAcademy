public class Samochodzik {
        String kolor;
        Silnik silnik;
        int liczbaDrzwi;
        int liczbaKol;

        Samochodzik() {
            this("czarny");
        }

        Samochodzik(String kolor) {
            this(kolor, new Silnik());
        }

        Samochodzik(String kolor, Silnik silnik) {
            this(kolor, silnik, 1);
        }

        Samochodzik(String kolor, Silnik silnik, int liczbaDrzwi) {
            this(kolor, silnik, liczbaDrzwi, 3);
        }

        Samochodzik(String kolor, Silnik silnik, int liczbaDrzwi, int liczbaKol) {
            this.kolor = kolor;
            this.silnik = silnik;
            this.liczbaDrzwi = liczbaDrzwi;
            this.liczbaKol = liczbaKol;
        }
    }

