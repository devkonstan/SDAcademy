public class enhLoop {
    public static void main(String[] args) {
//        String[] imiona = {"Ali", "Seba", "Zylu"};
//
//        for (String s : imiona) {
//            System.out.println(s);
//        }

        int[] inty = {2, 4, 6, 9, 11};
        double suma = 0;
//        for (int i : inty) {
//            suma += i;
//        }
//        System.out.println("srednia: " + suma / inty.length);

        for (int i : inty) {
            if (i%2==0) { //i odnosi sie do wartosci
                System.out.println("liczba jest parzysta");
            } else {
                System.out.println("liczba jest nieparzysta");
            }
        }
    }
}
