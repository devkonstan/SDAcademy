package list25;

public class TrajKecz2 {
    public static void main(String[] args) {
        double liczba1;
        double liczba2;
        //w arg 2 3 4
        liczba1 = tryParseDouble(args, 0);
        liczba2 = tryParseDouble(args, 2);

        System.out.println(liczba1 * liczba2);
    }

    static double tryParseDouble(String[] tab, int index) {
        try {
            return Double.parseDouble(tab[index]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return 1; //jesli poza wymiarem tablicy albo nieliczba to zamien na 1
        }
    }
}
