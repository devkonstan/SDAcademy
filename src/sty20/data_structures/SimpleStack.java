package sty20.data_structures;

/**
 * https://visualgo.net/en/list
 *
 * Zaimplementuj stos, przechowujacy dane typu int
 * Stos powinien posiadac nastepujace metody:
 *  - pop - sciaga element ze stosu
 *  - push - odklada element na stos
 *  - peek - pozwala podejrzec element na wierzchu stosu
 *  - isEmpty - sprawdza czy stos jest pusty
 */
public class SimpleStack {

    private Node head;
    private int size;

    public void push(int element) {
        Node newNode = new Node(element);

        if(head == null) {
            head = newNode;
        } else {
            Node temp = head;
            newNode.nextNode = temp;
            head = newNode;
        }
        size++;
    }

    public void pop() {
        if(isEmpty())
            return;

        Node temp = head;
        head = head.nextNode;
        temp = null;
        size--;
    }

    public int peek() {
        if(head == null) {
            return -1; // NOT FOUND
        }
        return head.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private class Node {
        int value;
        Node nextNode;

        Node(int value) {
            this.value = value;
        }
    }
}
