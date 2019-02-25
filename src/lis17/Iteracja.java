package lis17;

public class Iteracja {
    public static void main(String[] args) {
        Iteracja obiekt = new Iteracja();
        obiekt.sumaIteracja(2);
    }

    public int sumaIteracja(int n) {
        int suma = 0;
        while (n > 0) {
            suma = suma + n;
            n--;
            System.out.println(suma);
        }
        return suma;
    }
}


