package mta;

import java.util.Objects;
import java.util.TreeSet;

public class ZbiorTestowy {

    public static void main(String[] args) {
        new ZbiorTestowy().doDziela();
    }

    public void doDziela() {
        Ksiazka b1 = new Ksiazka("Jak działają koty");
        Ksiazka b2 = new Ksiazka("Remiks organiczny");
        Ksiazka b3 = new Ksiazka("Szukając Emo");
        TreeSet<Ksiazka> tree = new TreeSet<Ksiazka>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}

class Ksiazka implements Comparable{
    String tytul;

    public Ksiazka(String t) {
        tytul = t;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tytul='" + tytul + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 1;
    }

//    @Override
//    public int compareTo(Object o) {
//        Ksiazka k = (Ksiazka) o;
//        return (tytul.compareTo(k.tytul));
//    }
}

