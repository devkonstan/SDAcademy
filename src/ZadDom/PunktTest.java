package ZadDom;

import java.util.Scanner;

public class PunktTest {
    public static void main(String[] args) {
        double x,y;

        Scanner sc = new Scanner(System.in);
        System.out.println("zapodaj iksa [x]: ");
        x=sc.nextDouble();
        System.out.println("zapodaj igreka [y]: ");
        y=sc.nextDouble();

        Punkt.increment(x);

        Punkt.changeY(y);

        System.out.println(Punkt.returnX(x));

        System.out.println(Punkt.returnY(y));

        Punkt.showY(x,y);

    }
}
