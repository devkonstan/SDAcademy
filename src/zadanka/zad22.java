package zadanka;

import java.util.Scanner;

public class zad22 {

    static int[] TablicaDzielnikow(int a) { //funkcja zwraca tablice dzielników danej liczby

        int dzielnik = 1;
        int licznikDzielnikow = 0;

        while (dzielnik <= a) { //liczymy ilość dzielników, żeby wiedzieć, jaki ma być wymiar tablicy
            if (a % dzielnik == 0) {
                licznikDzielnikow++;
            }
            dzielnik++;
        }

        int tablicaDzielnikow[] = new int[licznikDzielnikow];

        dzielnik = 1;
        licznikDzielnikow = 0;

        while (dzielnik <= a) {             //wypełniamy tablicę dzielnikami
            if (a % dzielnik == 0) {
                tablicaDzielnikow[licznikDzielnikow] = dzielnik;
                licznikDzielnikow++;
            }
            dzielnik++;
        }

        return tablicaDzielnikow;
    }

    static boolean wzgledniePierwsze(int a, int b) {    //funkcja sprawdza, czy 2 liczby są względnie pierwsze
        //i zwraca true/false
        boolean kontrolka = true;

        for (int aa : TablicaDzielnikow(a)) {
            for (int bb : TablicaDzielnikow(b)) {
                if (aa == bb && aa != 1)
                    kontrolka = false;
            }
        }
        return kontrolka;
    }

    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        System.out.println("Podaj wymiar tablicy: ");
        Scanner skan = new Scanner(System.in);
        int n = skan.nextInt(); //wczytujemy rozmiar tablicy

        boolean[][] a = new boolean[n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = wzgledniePierwsze(i + 1, j + 1);
            }
        }

        System.out.print(" ");
        for (int b = 1; b < n + 1; b++) System.out.print(b);
        System.out.println();

        for (i = 0; i < a.length; i++) {
            System.out.print(i + 1);

            for (j = 0; j < a.length; j++) {
                if (a[i][j]) System.out.print("+");
                else System.out.print("-");
            }
            System.out.println();
        }
    }
}

