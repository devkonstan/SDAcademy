package gru02;

public class Potega {

    public static void main(String[] args) {
        Potega power = new Potega();
        power.potegowanie(-3);

        // wyswietli miejsca w pamieci
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println(a);

        }
        int b = ~2;
        System.out.println(b);
    }

    //jakas metoda Potega
    void potegowanie(double x) {
        if (x > 0)
            return;
        System.out.println(Math.pow(x, 2)); //jak bedzie wieksze od 0 to nie wejdzie tutaj
    }
}