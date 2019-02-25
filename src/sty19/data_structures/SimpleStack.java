package sty19.data_structures;


/**
 * https://visualgo.net/en/list
 * <p>
 * Zaimplementuj stos, przechowujacy dane typu int
 * TestStrona powinien posiadac nastepujace metody:
 * - pop - sciaga element ze stosu
 * - push - odklada element na stos
 * - peek - pozwala podejrzec element na wierzchu stosu
 * - isEmpty - sprawdza czy stos jest pusty
 */
public class SimpleStack {

    private static final int NOT_FOUND = -1;
    private Node head;
    private int size;
    int element;
    int tmp;


    public int getSize() {

        return size;
    }

    public int peek() { //tylko pobiera element
//        if (head == null) {
//            return -1;
//        } else {
//            return head.value;
//        }
        return head == null ? NOT_FOUND : head.value;
    }

    public int pop() { //pobiera i usuwa element
        if (isEmpty()) {
            return NOT_FOUND;
        }
        Node temp = head;
        head = head.nextNode; //przypisuje siebie do nastepnika
        int returnedValue = temp.value;
        temp = null; //dzialanie GC tu sie uwidoczni
        size--;

        return returnedValue; //return musi byc na koncu
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public void push(int element) { //dodaje element
        Node newNode = new Node(element); //czesc wspolna

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head; //stary(biezacy) head przypisujemy do zmiennej tymczasowej
            newNode.nextNode = temp; //nowy wezel zapamietuje starego head'a (wiaze je ze soba)
            head = newNode; //newNode ustawiany na nowym head'zie
        }
        size++;
    }

    private class Node {
        //element + nastepny wezel
        int value; //dane typu int
        Node nextNode; //nastepny wezel bedacy obiektem tego samego typu

        Node(int value) {

            this.value = value;
        }
    }
}

