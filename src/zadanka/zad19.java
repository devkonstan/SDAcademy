package zadanka;

import java.util.Random;

public class zad19 {
    public static void main(String[] args) {
        double[][] macierz = new double[5][5];

        Random r = new Random();

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                macierz[i][j] = r.nextInt(6) * (r.nextBoolean() ? -1 : 1);
            }
        }

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("**********");

        for (int i = 0; i < macierz.length; i++) {
            double max = Integer.MIN_VALUE;
            for (int j = 0; j < macierz[i].length; j++)
                if (macierz[j][i] > max)
                    max = macierz[j][i];
            System.out.println("Maximum of column " + i + " = " + max);
        }

        System.out.println();
        for (int i = 0; i < macierz.length; i++) {
            double min = Integer.MAX_VALUE;
            for (int j = 0; j < macierz[i].length; j++)
                if (macierz[j][i] < min)
                    min = macierz[j][i];
            System.out.println("Minimum of column " + i + " = " + min);
        }
    }

}