package sty12;

public class zad08 {
    public static void main(String[] args) {
        int size=10;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || j==0 || i==size-1 || j==size-1 || i==j || i==size-1-j) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
