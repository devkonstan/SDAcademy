package lis17;

public class Rekurencja {

    public static void main(String[] args) {

        Rekurencja obiekt=new Rekurencja();
        obiekt.wyswietlXRazy("Konrad",1);
    }

    public void wyswietlXRazy(String imie, int displayCount) {
        System.out.println(displayCount);

        if (displayCount >5) {
            System.out.println("x="+displayCount+" "+imie);
            return;
        }
        wyswietlXRazy(imie,++displayCount);
    }
}