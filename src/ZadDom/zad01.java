package ZadDom;

import java.util.Scanner;

public class zad01 {
    public static void main(String[] args) {
        System.out.println("podaj temperaturę w \u2103: ");
        Scanner sc = new Scanner(System.in);
        double tempCel = sc.nextDouble();
        double tempFahr =1.8*tempCel+32;
        System.out.println("w \u2109 wynosi ona: "+tempFahr);
    }
}
