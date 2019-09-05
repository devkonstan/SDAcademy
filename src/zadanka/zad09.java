package zadanka;

import java.util.Scanner;

public class zad09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę całkowitą +: ");
        int liczba = sc.nextInt();
        int podstawa = 2;
        double potega = 0;
        int i = 0;
        double pierw = Math.sqrt(liczba);
       System.out.println("pierwiastek "+pierw);

        while (potega <= liczba) {
            System.out.print((int) potega + " ");
            potega = Math.pow(podstawa, i);
            i++;
        }
    }
}

