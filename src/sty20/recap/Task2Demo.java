package sty20.recap;

import java.util.Scanner;

public class Task2Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String input = scanner.nextLine();

            if(input.toLowerCase().equals("q"))
                break;

            try {
                int number =  Integer.parseInt(input);
                System.out.println("Podana liczba jest " + (number % 2 == 0 ? "parzysta" : "nieparzysta"));
            } catch(Exception ex) {
                System.out.println("Wpisano zle dane! Sprobuj ponownie.");
            }
        }
    }
}