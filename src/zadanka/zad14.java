package zadanka;

import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
//        Zadanie 14. Napisać program rysujący w konsoli „choinkę” złożoną
//        ze znaków gwiazdki (*). Użytkownik programu powinien podać liczbę
//        całkowitą n, n > 0, określającą wysokość choinki (liczbę wierszy).
//        Przykład: dla n = 5 wynik powinien wyglądać następująco:
//                *
//               ***
//              *****
//             *******
//            *********
        char spacja = ' ';
        char znak = '*';
        int wys;
        int a = 0;
        int c;

        System.out.println("Podaj wysokosc choinki: ");
        Scanner sc = new Scanner(System.in);
        wys = sc.nextInt();

        if (wys > 0) {
            for (int i = 0; i < wys; i++) {

                for (int j = wys; j > i + 1; j--) {

                    System.out.print(spacja);

                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(znak);
                    if (a == 0) {
                        System.out.print("\n");
                        a++;
                    }
                }
                if (i > 0) {
                    for (int k = 0; k < i; k++) {
                        System.out.print(znak);
                    }
                    System.out.print("\n");
                }
            }
        } else System.out.println("Wysokosc choinki musi byc wieksza od zera.");
    }
}