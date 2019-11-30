public class LinkedList {

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    Node first = null;

    public void addAtFront(Node node) {
        node.next = first;
        first = node;
    }

    public void addAtEnd(Node node) {
        if (first == null) { //jesli to pusta lista
            first = node; //tworzy wezel poczatkowy w miejscu nulla
        } else {
            Node ptr = first; //powoluje wezel tymczasowy, ktory jest pusty
            while (ptr.next != null) { //dopoki ostatni wezel nie bedzie nullem
                ptr = ptr.next; //przerzuca po kolei ptr na koniec listy
            }
            ptr.next = node; //wezel ptr bedacy miejscem w pamieci dostaje wartosc z konstruktora
        }
    }

    public void removeFront() {
        first = first.next;
    }

    public void print() {
        Node node = first;
        while (node != null) {
            System.out.println(node.value); //wyswietla first
            node = node.next; //ustawia nastepny w kolejce
        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtEnd(new Node(4));
        list.addAtFront(new Node(6));
        list.addAtEnd(new Node(9));
        list.addAtFront(new Node(1));
        list.print();
    }
}
