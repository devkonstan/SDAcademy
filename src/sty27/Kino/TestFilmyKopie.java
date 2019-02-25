package sty27.Kino;

// Napisz aplikację, która będzie realizować kolejno dwa mechanizmy klonowania:
// - shallow_copy
// - deep_copy
// Aplikacja zawiera następującą strukturę:
// - class Film o polach: tytuł, rok, wydania, Reżyser, gdzie reżyser jest osobnym obiektem realizowanym przez klasę:
// - class Director o polach: imię, nazwisko, rodzaj kręconych filmów.
// Zaprezentuj na przykładzie każdy mechanizm klonowania.
public class TestFilmyKopie {
    public static void main(String[] args) throws CloneNotSupportedException {
        //tworze rezyserow
        //tworze filmy
        //kopiuje filmy

        Director rez1 = new Director("Krzysztof", "Kononowicz", "dramat");
        Director rez2 = new Director("Daniel", "Magical", "patostream");
        Director rez3 = new Director("Andrzejek", "Wujek", "komedia");

        Film film1 = new Film("Spot wyborczy", 2007, rez1);
        Film film2 = new Film("Live 24H", 2017, rez2);
        Film film3 = new Film("monolog", 2018, rez3);
        Film film4 = null;


        film4 = (Film) film1.clone();
        System.out.println(film1);
        System.out.println(film4);
        rez1.gatunek = "bajka";
        System.out.println(film1); //gatunek ustawiony w obu
        System.out.println(film4);

        System.out.println("***********");

        try {
            film4 = (Film) film1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(film1.tytul);
        film4.tytul = "dialog";
        System.out.println(film4.tytul); //podmienia tytul
    }
}
