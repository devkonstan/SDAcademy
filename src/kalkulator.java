
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {

        double liczba1 = 5;
        double liczba2 = 0;
        double wynik;
        System.out.println("podaj znak");
        Scanner sc=new Scanner(System.in);
        char znak= sc.next().charAt(0);

        if (znak == '+') {
            wynik = liczba1 + liczba2;
            System.out.println(wynik);
        } else if (znak == '-') {
            wynik = liczba1 - liczba2;
            System.out.println(wynik);
        } else if (znak == '*') {
            wynik = liczba1 * liczba2;
            System.out.println(wynik);
        } else if (znak == '/') {
            if (liczba2 != 0) {
                wynik = liczba1 / liczba2;
                System.out.println(wynik);
            }
            else {
                System.out.println("nie mozna dzielnic przez 0!");
            }
        }
    }
}
