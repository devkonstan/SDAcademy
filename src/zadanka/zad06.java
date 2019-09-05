package zadanka;

import java.util.Scanner;

public class zad06 {
    public static void main(String[] args)

    {
        System.out.println("witam Ciebie, jestem kalkulatorem :-)");
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj 1 liczbę: ");
        double liczba1 = sc.nextDouble();

        System.out.println("podaj znak");
        char znak = sc.next().charAt(0);

        System.out.println("podaj 2 liczbę: ");
        double liczba2 = sc.nextDouble();

        double wynik;

        switch (znak) {
            case '+':
                wynik = liczba1 + liczba2;
                System.out.println(wynik);
                break;

            case '-':
                wynik = liczba1 - liczba2;
                System.out.println(wynik);
                break;

            case '*':
                wynik = liczba1 * liczba2;
                System.out.println(wynik);
                break;

            case '/':
                if (liczba2 != 0) {
                    wynik = liczba1 / liczba2;
                    System.out.println(wynik);
                } else {
                    System.out.println("nie mozna dzielnic przez 0!");
                }
                break;

            default:
                System.out.println("nie wiem co zrobić ¯\\\\\\_(ツ)\\_/¯");

        }
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        String klawisz;
//        while ((klawisz=br.readLine())!="") {
//            System.out.println("wcisnij enter!");
//        }
        }

            //System.exit(0);
//        if (sc.nextLine().equals(""));
//        System.exit(0);
    }


