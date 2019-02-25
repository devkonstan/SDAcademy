package ZadDom;

import java.util.Scanner;
//dodac wyjatki
class zad05 {
    public static void main(String[] args) {
        double cena;
        int liczbaRat;

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj cenę towaru (100-10K): ");

        cena = sc.nextDouble();
        while (cena < 100 || cena > 10_000) {
            System.out.println("prosze ponownie podaj dane z zakresu");
            cena=sc.nextDouble();
        }

        System.out.println("podaj ilość rat (6-48): ");
        liczbaRat = sc.nextInt();
        while (liczbaRat <6 || liczbaRat > 48) {
            System.out.println("prosze ponownie podaj dane z zakresu");
            liczbaRat = sc.nextInt();
        }
        System.out.println("liczba rat: " + liczbaRat);

        double rata;
        //rata=czesc kapitalowa+odsetki
        if (liczbaRat <= 12) {
            rata = (0.025 * cena) + (cena / liczbaRat);
            System.out.printf(" 0.025 miesieczna rata wyniesie %,.2f zł", rata);
            //System.out.printf("%4.2f", rata);
        } else if (liczbaRat <= 24) {  //czemu podswietla tutaj?
            rata = (0.05 * cena) + (cena / liczbaRat);
            System.out.printf("0.05 miesieczna rata wyniesie %4.2f zł", rata);
        } else {
            rata = (0.1 * cena) + (cena / liczbaRat);
            System.out.printf("0.1 miesieczna rata wyniesie %4.2f zł", rata);
        }
    }
}