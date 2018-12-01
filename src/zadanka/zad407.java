package zadanka;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class zad407 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj jakis wyraz");
        String wyraz = sc.next();
        char[] wyrazjakotablica = wyraz.toCharArray();

        for (int i = 0; i < wyrazjakotablica.length; i++) {
            System.out.print(wyrazjakotablica[wyrazjakotablica.length - 1 - i]);
        }
    }
}
