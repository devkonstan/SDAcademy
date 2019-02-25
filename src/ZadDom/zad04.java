package ZadDom;

import java.util.Scanner;

public class zad04 {
    public static void main(String[] args) {
        double dochod;
        double podatek;
        double zmniejszenie = 556.02;
        double prog = 85_528;
        double kwota_wol=3091;
        double kwota_wol_2 = 14_839.02;
        Scanner sc = new Scanner(System.in);

        System.out.println("podaj dochód: ");
        dochod = sc.nextDouble();

        if (dochod <= prog && dochod>kwota_wol) {
            podatek = (0.18 * dochod) - zmniejszenie;
            System.out.println("podatek wyniesie: " + podatek + " zł");
        } else if (dochod<=kwota_wol) {
            System.out.println("podatku do zaplacenia nie bedzie");
        } else {
            podatek = kwota_wol_2 + 0.32 * (dochod - prog);
            System.out.println("podatek wyniesie: " + podatek + " zł");
        }
    }
}