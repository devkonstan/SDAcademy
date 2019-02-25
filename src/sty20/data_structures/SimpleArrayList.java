package sty20.data_structures;

import java.util.Arrays;

/**

 *  Zaimplementuj liste wiazana jednokierunkowa, przechowujaca dane typu int
 *  Lista powininna posiadac nastepujace metody:
 *  - add - dodaje element na koniec listy
 *  - get - zwracajaca element o podanym indeksie
 *  - getSize() - zwraca ilosc elementow w liscie
 *  - isEmpty - sprawdza czy lista jest pusta
 */
public class SimpleArrayList {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private int elements[];

    public SimpleArrayList() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public void add(int e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public int get(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return elements[index];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}