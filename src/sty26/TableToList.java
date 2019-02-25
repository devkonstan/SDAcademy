package sty26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TableToList {
    public static void main(String[] args) {
        Random generator = new Random();
        int randomInt = generator.nextInt(101); // losuje od 0-100, 101 jest wartoscia graniczna

        int[] tablica = new int[10]; //domyslne wartosci 0
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = generator.nextInt(101);
            System.out.print(tablica[i] + " ");
        }

        System.out.println();

        List<Integer> mojaLista = new ArrayList<>();
        for (int i = 0; i < tablica.length; i++) {
            mojaLista.add(tablica[i]);
        }

        System.out.println(mojaLista);

        int maximum = Collections.max(mojaLista);
        System.out.println("max wartosc: "+maximum);

        int minimum = Collections.min(mojaLista);
        System.out.println("min wartosc: "+minimum);

        //zoptymalizowac zapis do : ?
        int max = mojaLista.get(0); //bierzemy 1. element z listy
        for (int i = 1; i < mojaLista.size(); i++) { //iterujemy od 2. elementu
//            if (max < mojaLista.get(i)) {
//                max = mojaLista.get(i);
//            }
            max = max < mojaLista.get(i) ? mojaLista.get(i) : max;
        }

        System.out.println(max);

        int min = mojaLista.get(0);
        for (int i = 1; i < mojaLista.size(); i++) {
//            if (min > mojaLista.get(i)) {
//                min = mojaLista.get(i);
//            }
            min = min > mojaLista.get(i) ? mojaLista.get(i) : min;
        }
        System.out.println(min);
    }

    public int getMax(ArrayList<Integer> list) {
        return Collections.max(list);
    }


    public int getMin(ArrayList<Integer> list) {
        return Collections.min(list);
    }
}


