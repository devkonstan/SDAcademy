package lis25;

import java.util.Arrays;

public class TrajKecz {
    public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));
//jak wpisac argumenty w ciele metody?
        double liczba1, liczba2;

        try {
            liczba1 = tryParseDouble(args[0]); // 1
            liczba2 = tryParseDouble(args[5]); // 6
        } catch (NumberFormatException nfe) {
            liczba1=1; // w zasadzie obojetnie jaka wartosc tu moze byc
            liczba2=2; // w zasadzie obojetnie jaka wartosc tu moze byc
        }

        System.out.println(liczba1 / liczba2);
    }

    static double tryParseDouble(String numAsString) {
        try {
            return Double.parseDouble(numAsString);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return 1; //zamieni kazda z liczb na 1, jesli bym wpisal 0 to NaN
        }
    }
}

