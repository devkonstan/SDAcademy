public class Queue {

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first = null;
    private Node last = null;

    public void enqueue(Node node) {
        if (last == null) {
            first = last = node; // przy pierwszym
        } else {
            last.next = node; // powoluje nowy wezel
            last = node; //przypisuje do nowego wartosc z konstruktora
        }

    }

    public void dequeue() {
        first = first.next;
        if (first == null) // przy ostatnim wezle
            last = null;
    }

    public void print() {
        Node node = first;
        while (node != null) {
            System.out.println(node.value);
            node = node.next; //ustawia nastepny w kolejce
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(new Node(3));
        queue.enqueue(new Node(6));
        queue.enqueue(new Node(1));
        queue.enqueue(new Node(4));
    }
}
