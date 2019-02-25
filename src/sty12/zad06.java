package sty12;

import java.util.Scanner;

public class zad06 {
    public static void main(String[] args) {
        String tekst;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("podaj jakis tekst: ");
            tekst = sc.nextLine();
            if (tekst.equals("koniec")) {
                break;
            }
        }
    }
}
