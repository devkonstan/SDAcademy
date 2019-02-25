package Metody;

public class Prostokat {
    int szerokosc;
    int wysokosc;
    int pole;

    public Prostokat(int szerokosc, int wysokosc) {
        pole = wysokosc * szerokosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public void wyswietlArg() {
        System.out.println("wyswietlam: " + szerokosc + " " + wysokosc);
    }

    //getter 1
    public int wyswietlSzer() {
        if (szerokosc < 0) {
            return szerokosc=3; //domyslna wartosc
        } else {
            return szerokosc;
        }
    }

    //getter 2
    public int wyswietlWys() {
        if (wysokosc < 0) {
            return wysokosc = 3; //domyslna wartosc
        } else {
            return wysokosc;
        }
    }

    public int wyswietlPole() {
        return pole;
    }

    public void setSzerokosc(int szerokosc) {
        if (szerokosc > 0) {
            this.szerokosc = szerokosc;
            pole = wysokosc * szerokosc;
        } else {
            System.out.println("ustawiam szerokosc na 0");
            this.szerokosc=0;
        }
    }

    public void setWysokosc(int wysokosc) {
        if (wysokosc > 0) {
            this.wysokosc = wysokosc;
            pole = wysokosc * szerokosc;
        } else {
            System.out.println("ustawiam wysokosc na 0");
            this.wysokosc = 0;
        }
    }

    //nowa metoda oblicz pole, zamiast pol uzywac metod
    public void zwrocPole() {
        System.out.println(wyswietlPole());
    }
}
