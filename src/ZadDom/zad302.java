package ZadDom;

import java.io.IOException;
import java.util.Scanner;

public class zad302 {
    double a, b, c, delta, x1, x2;
    char numOfEl;

    public void read_data()
            throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("postać równania ax+bx+c=0");
        System.out.println("podaj par a: ");
        a = sc.nextDouble();

        if (a == 0) {
            System.out.println("niedozwolona wartość par a!");
            System.exit(1);
        } else {
            System.out.println("podaj par b: ");
            b = sc.nextDouble();
            System.out.println("podaj par c: ");
            c = sc.nextDouble();
        }
    }

    public void process_data() {
        delta = b * b - 4 * a * c;

        if (delta < 0) numOfEl = 0;
        if (delta == 0) numOfEl = 1;
        if (delta > 0) numOfEl = 2;

        switch (numOfEl) {
            case 1:
                x1 = -b / (2 * a);
                break;
            case 2: {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
            }
            break;
            //brak warunku z 0, bo nic nie liczymy wtedy
        }
    }

    public void show_result() {
        System.out.println("dla liczb:");
        System.out.printf("a = " + "%2.2f ", a);
        System.out.printf("b = " + "%2.2f ", b);
        System.out.printf("c = " + "%2.2f ", c);

        switch (numOfEl) {
            case 0:
                System.out.println(" brak pierwiastkow rzecz");
                break;
            case 1:
                System.out.printf(" istnieje 1 pierw podwojny: " + "x1= " + "%2.2f", x1);
                break;
            case 2: {
                System.out.println(" istnieja 2 pierw: ");
                System.out.printf("x1 = " + "%2.2f ", x1);
                System.out.printf("x2 = " + "%2.2f", x2);
            }
            break;
        }
    }

    public static void main(String[] args)
            throws IOException {
        zad302 trojmian = new zad302();

        trojmian.read_data();
        trojmian.process_data();
        trojmian.show_result();
    }
}
