package mta;

import java.util.Comparator;
import java.util.TreeSet;

public class ZbiorTestowyComparator {
    public static void main (String[] args) {
        new ZbiorTestowyComparator().doDziela();
    }
    public void doDziela() {
        Book b1 = new Book("Jak działają koty");
        Book b2 = new Book("Remiks organiczny");
        Book b3 = new Book("Szukając Emo");
        KsiazkaCompare komparator = new KsiazkaCompare();
        TreeSet<Book> tree = new TreeSet<Book>(komparator); //przeladowany konstruktor
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}

class KsiazkaCompare implements Comparator<Book> {
    public int compare(Book k1, Book k2) {
        return (k1.tytul.compareTo(k2.tytul));
    }
}

class Book {
    String tytul;

    public Book(String t) {
        tytul = t;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tytul='" + tytul + '\'' +
                '}';
    }

}
