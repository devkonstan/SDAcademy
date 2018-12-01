package list18;

import java.util.Scanner;

public class Sandbox {

public static void main(String[]args){

        double n;

        Scanner skaner=new Scanner(System.in);

        System.out.println("WYSWIETLANIE KWADRATU");
        System.out.println("_______________");
        System.out.println("Podaj liczbe: ");
        n=Math.round(skaner.nextDouble());
        double trzeciaPotega=(n*n)*n;
        System.out.println("Trzecia potega z liczby calkowitej mniejszej badz rownej podanej: ");
        System.out.println(trzeciaPotega);
        }
}