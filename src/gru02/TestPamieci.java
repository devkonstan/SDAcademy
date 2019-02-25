package gru02;

public class TestPamieci {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(10, 10);
        Punkt punkt2 = punkt1;
        Punkt punkt3 = new Punkt(10, 10);
        int p1 = 4;
        int p2 = 4;
        System.out.println(p1==p2); //prymitywy sa rowne mimo, roznych referencji
        boolean porownanie1 = punkt1 == punkt2; //wskazuje to samo miejsce w pamieci -> true
        boolean porownanie2 = punkt1 == punkt3; //inne miejsca w pamieci, wiec false

        System.out.println(punkt1.equals(punkt2));
        System.out.println(punkt1.equals(punkt3));

        System.out.println("Porownanie1: " + porownanie1);
        System.out.println("Porownanie2: " + porownanie2);
        wyswietl(punkt1, punkt2, punkt3);

        punkt1.setX(13);
        punkt2.setX(11); //nadpisze zmiane na 11 dla punkt1 i punkt2
        punkt3.setX(12);
        wyswietl(punkt1, punkt2, punkt3);
    }

    public static void wyswietl(Punkt... punkty) {
        int size = punkty.length;
        for (int i = 0; i < size; i++) {
            System.out.println("Punkt " + i + " x:" + punkty[i].getX() + " ; y:" + punkty[i].getY());
        }
        System.out.println();
    }
}

class Punkt {
    private int x;
    private int y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}