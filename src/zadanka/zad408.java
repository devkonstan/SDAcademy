package zadanka;

import java.util.Scanner;

public class zad408 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj ciag znakow");
        String s = sc.nextLine();

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum = sum + Character.getNumericValue(s.charAt(i));
            }
        }
        System.out.println(sum);
    }
}

