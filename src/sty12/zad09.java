package sty12;

public class zad09 {
    public static void main(String[] args) {
        int size=10;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j==0 || i==size-1 || i==j) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
