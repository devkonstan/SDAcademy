package sty13;

import java.util.Scanner;

public class TestWartosci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int suma = 0;
        while (i++ < 5) {
            System.out.println("Podaj wartość do zsumowania : ");
            int value = scanner.nextInt();
            if (value > 10) {
                break;
            }
            suma = suma + value;

        }
        System.out.println("Suma naszych wartości to : " + suma);

    }
}

