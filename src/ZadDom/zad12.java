package ZadDom;

import java.util.Random;
import java.util.Scanner;

public class zad12 {

    public static void main(String[] args) {

        int losowana, moja;
        Scanner s = new Scanner(System.in);
        Random generator = new Random();
        losowana = (generator.nextInt(100));
        System.out.println("Odganij wylosowana liczbe.");

        do {
            System.out.println("Podaj liczbe z zakresu od 0 do 100: ");
            moja = s.nextInt();
            if (losowana < moja) {
                System.out.println("Podałeś za dużą wartość.");
            }
            if (losowana > moja) {
                System.out.println("Podałeś za mala wartość.");
            }
            //brak warunku == skutkuje wyjsciem z petli
        } while (losowana < moja || losowana > moja);
        System.out.println("Gratulacje! "+losowana+"="+moja);
    }
}

