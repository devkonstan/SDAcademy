package ZadDom;

import java.util.Scanner;

public class zad304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte dzien;
        System.out.println("podaj numer dnia tyg (1-7):");
        dzien = sc.nextByte(7);

        switch (dzien) {
            case 1:
                System.out.println("poniedzialek");
                break;
            case 2:
                System.out.println("wtorek");
                break;
            case 3:
                System.out.println("środa");
                break;
            case 4:
                System.out.println("czwartek");
                break;
            case 5:
                System.out.println("piątek");
                break;
            case 6:
                System.out.println("sobota");
                break;
            case 7:
                System.out.println("niedziela");
                break;
        }
    }

}
