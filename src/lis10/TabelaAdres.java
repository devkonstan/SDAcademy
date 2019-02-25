package lis10;

public class TabelaAdres {
    public static void main(String[] args) {
        String[] tab= new String[3];
        tab[0]="Ali";
        tab[1]="Bolo";
        tab[2]="Rocky";

        for (int i = 0; i < tab.length; i++) {
            String s = tab[i];
            System.out.println(s);
        }

//        System.out.println(tab[0]);
//        System.out.println(tab[1]);
//        System.out.println(tab[2]);

        System.out.println(tab); //wyswietli adres w pamieci tab
    }
}
