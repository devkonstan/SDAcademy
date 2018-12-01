public class kolkoIkrzyzyk {
    public static void main(String[] args) {

        char[][] plansza = new char[5][5]; //wymiary 6x6

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 1) plansza[i][j] = '|';
                    else plansza[i][j] = ' ';
                } else {
                    if (j % 2 == 1) plansza[i][j] = '+';
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
