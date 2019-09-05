package ZadDom;

import java.util.Scanner;

public class zad407 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj jakis wyraz");
        String wyraz = sc.next();
        char[] tablicaZnakow = wyraz.toCharArray();

        for (int i = 0; i < tablicaZnakow.length; i++) {
            System.out.print(tablicaZnakow[tablicaZnakow.length - 1 - i]);
        }
    }
}
