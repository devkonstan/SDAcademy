package Metody;

import Operacje.*;

public class Kalk {

    public static void main(String[] args) {
        if (args.length == 3) {


            double liczba1 = Double.parseDouble(args[0]);
            String symbolDzialania = args[1];
            double liczba2 = Double.parseDouble(args[args.length - 1]);

            Dodawanie suma = new Dodawanie();
            Odejmowanie roznica = new Odejmowanie();
            Mnożenie mnozenie = new Mnożenie();
            Dzielenie dzielenie = new Dzielenie();
            Modulo modulowanie=new Modulo();

            switch (symbolDzialania) {
                case "+":
                    suma.pobierzLiczby(liczba1, liczba2);
                    suma.wyswietlWynik();
                    break;

                case "-":
                    roznica.pobierzLiczby(liczba1,liczba2);
                    roznica.wyswietlWynik();
                    break;

                case "*":
                    mnozenie.mnozymy(liczba1,liczba2);
                    mnozenie.wyswietlWynik();
                    break;

                case "/":
                    dzielenie.dzielimy(liczba1,liczba2);
                    dzielenie.wyswietlWynik();
                    break;

                case "%":
                    modulowanie.modulujemy(liczba1,liczba2);
                    modulowanie.wyswietlWynik();
                    break;
                default:
                    System.out.println("nie wiem co zrobić ¯\\\\\\_(ツ)\\_/¯");

            }
        } else {
            System.out.println("niewlasciwa liczba argumentow!");
        }
    }
}

