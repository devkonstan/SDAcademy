import com.sun.javafx.binding.StringFormatter;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        char znaczek = 432;
        double c = (double) znaczek;
//        System.out.println(znaczek);
//        System.out.println(c);
        int something = 4;
//        System.out.println(something);
        byte bajt = 34;
        short krotki = 4342;
        long dlugi = 321241;
        float plywak = 3241.42312f;
        double podwojny = 932988932.3231d;
        String napis = "coś";
//        System.out.println(bajt+" "+krotki+" "+dlugi+" "+plywak+" "+podwojny);
//        System.out.println(napis);
        System.out.println(something * something);
        short wiek = 43;
        short rok = 365;
        short dzien = 24;
        short godzina = 60;
        short sekunda = 60;
        int wiekWDniach = wiek * rok;
        int wiekWSekundach = wiek * rok * dzien * godzina * sekunda;
        System.out.println(wiekWSekundach);
        int test = 1356048000;
        short wzrost;
        float minimum = 160.00f;
        Scanner sc = new Scanner(System.in);
        wzrost = sc.nextShort();
        boolean porownanie = wzrost >= minimum;
        System.out.println(porownanie);


    }
}
