package list17;

public class rek {

    public void wyswietlXRazy(String imie, int displayCount) {
        System.out.println(displayCount);

        if (displayCount >5) {
            System.out.println("x="+displayCount+" "+imie);
            return;
        }
        wyswietlXRazy(imie,++displayCount);
    }

    public static void main(String[] args) {

        rek obiekt=new rek();
        obiekt.wyswietlXRazy("Konrad",1);
    }

}