package zadanka;


import java.util.Scanner;

public class zad406 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj jakis wyraz");
        String wyraz = sc.next();
        char ostatni = wyraz.charAt(wyraz.length() - 1);
        int count = 0;

        for (int i = 0; i < wyraz.length(); i++) {
            if (wyraz.charAt(i) == ostatni) {
                count++;
            }
        }
        System.out.println("ostatni znak ["+ostatni +"] wystapil: "+count+" razy");
    }
}
