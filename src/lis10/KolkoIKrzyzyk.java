package lis10;

public class KolkoIKrzyzyk {
    public static void main(String[] args) {

        char[][] plansza = new char[5][5]; //wymiary 6x6

        for (int i = 0; i < 5; i++) { //wiersze
            for (int j = 0; j < 5; j++) { //kolumny
                if (i % 2 == 0) { //jesli wiersze sa parzyste
                    if (j % 2 == 1) plansza[i][j] = '|'; //jesli kolumny sa nieparzyste
                    else plansza[i][j] = ' ';
                } else { //jesli wiersze sa nieparzyste
                    if (j % 2 == 1) plansza[i][j] = '+'; //jesli kolumny sa nieparzyste
                    else plansza[i][j] = '-';
                }

            }

        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(plansza[i][j]);
            }
            System.out.println();
        }
    }
}
