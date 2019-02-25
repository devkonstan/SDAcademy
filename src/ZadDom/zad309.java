package ZadDom;

public class zad309 {
    public static void main(String[] args) {

        int i, j;
        int k=0;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                k++;
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
