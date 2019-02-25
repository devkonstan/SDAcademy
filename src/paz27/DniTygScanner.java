package paz27;

import java.util.Scanner;

public class DniTygScanner {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        System.out.println("podaj nr dnia tyg od 1 do 365");
        int dzienTyg = liczba.nextInt();
        //int dzienTyg=10;
        switch (dzienTyg%7) {
            case 1:
                System.out.println("poniedzialek");
                break;
            case 2:
                System.out.println("wtorek");
                break;
            case 3:
                System.out.println("sroda");
                break;
            case 4:
                System.out.println("czwartek");
                break;
            case 5:
                System.out.println("piatek");
                break;
            case 6:
                System.out.println("sobota");
                break;
            case 0:
                System.out.println("niedziela");
                break;
            default:
                System.out.println("brak takiego dnia ");

        }
    }

}
