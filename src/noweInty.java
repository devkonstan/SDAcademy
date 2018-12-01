public class noweInty {
    public static void main(String[] args) {
        int n = 10;
        int dane[] = new int[n];

        for (int i = 0; i < dane.length; i++) {
            if (i < dane.length - 1) {
                dane[i] = i * i;
                System.out.print(dane[i] + ", ");
            } else {
                dane[i] = i * i;
                System.out.print(dane[i] + ".");
            }
        }
    }
}