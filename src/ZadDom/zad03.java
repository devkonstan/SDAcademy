package ZadDom;

import java.util.Scanner;

public class zad03 {
    public static void main(String[] args) {
        double waga, wzrost;
        Scanner sc = new Scanner(System.in);

        System.out.println("podaj wagę w kg: ");
        waga = sc.nextDouble();

        System.out.println("podaj wzrost w cm: ");
        wzrost = sc.nextDouble();

        double bmi = waga / (wzrost/100 * wzrost/100);
        System.out.println(bmi);
        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("waga prawidlowa");
        } else if (bmi < 18.5) {
            System.out.println("niedowaga");
        } else {
            System.out.println("nadwaga");
        }

    }
}
