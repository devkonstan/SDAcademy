package sty12;

public class Operacje {
    public static void dodaj(int a, int b) {
        System.out.println(a + b);
    }

    public static void odejmij(int a, int b) {
        System.out.println(a - b);
    }

    public static void przemnoz(int a, int b) {
        System.out.println(a * b);
    }

    public static void podziel(int a, int b) {
        if (b == 0) {
            System.out.println("nie mozna dzielic przez 0!");
        } else {
            System.out.println(a / b);
        }
    }
    public static void reszta ( int a, int b){
        if (b == 0) {
            System.out.println("nie mozna dzielic przez 0!");
        } else {
            System.out.println(a % b);
        }
    }
}
