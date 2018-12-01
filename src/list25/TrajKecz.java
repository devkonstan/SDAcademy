package list25;

import java.util.Arrays;

public class TrajKecz {
    public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));

        double liczba1, liczba2;

        try {
            liczba1 = tryParseDouble(args[0]); //1
            liczba2 = tryParseDouble(args[5]);
        } catch (NumberFormatException nfe) {
            liczba1 = 0;
            liczba2 = 0;
        }

        System.out.println(liczba1 / liczba2); //1*2
    }

    static double tryParseDouble(String numAsString) {
        try {
            return Double.parseDouble(numAsString);
        } catch (NumberFormatException |ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }
}

