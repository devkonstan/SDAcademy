package paz27;

import java.util.Scanner;

public class PrzedzialWiekowy {
    public static void main(String[] args) {
        System.out.println("podaj swoja plec: m albo k");
        Scanner sk = new Scanner(System.in);
        char plec = sk.next().charAt(0);

        System.out.println("podaj paz27.Wiek");
        Scanner sc = new Scanner(System.in);
        short wiek = sc.nextShort();


        short przedprod = 18;
        short prod = 60;
        short emeryt_k = 60;
        short emeryt_m = 65;

        if (wiek >= prod) {
            switch (plec) {
                case 'm':
                    if (wiek >= emeryt_m) {
                        System.out.println("jestes emerytem");
                    } else if (wiek < emeryt_m) {
                        System.out.println("jeszcze troche brakuje do emeryturki");
                    }
                    break;
                case 'k':
                    System.out.println("jestes emerytka");
                    break;
            }
        } else if (wiek < prod && wiek >= przedprod) {
            System.out.println("jestes w wieku produkcyjnym");
        } else if (wiek < przedprod) {
            System.out.println("jestes dzieckiem");
        }
    }
}