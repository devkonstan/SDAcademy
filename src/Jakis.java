import java.util.Scanner;

public class Jakis {
    public static void main(String[] args) {
        Dom domek = new Dom();
        System.out.println(domek.drzwiczki.liczbaDrzwi);
        System.out.println(domek.oknaDachowe.oknaDachowe);
        System.out.println(domek.okieneczka.length);

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj kolor: ");
        Samochod mercedes = new Samochod(sc.next());

        System.out.println("podany kolor: " + mercedes.kolor);

        System.out.println("podaj pojemnosc: ");
        Silnik engine = new Silnik(sc.nextInt());
        System.out.println("podana przez uzytkownika pojemnosc: " + engine.pojemnosc);
        System.out.println("domyslna wartosc: " + mercedes.silniczek.pojemnosc);

        Samochod audi = new Samochod("red");
        System.out.println(audi.silniczek.pojemnosc);

    }
}
