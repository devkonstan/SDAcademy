public class Stack {

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first = null;

    public void push(Node node) {
        node.next = first; //powoluje nowy wezel o wartosci null
        first = node; //podstawia wezel z konstruktora pod tego o wartosci null
    }

    public void pop() {
        first = first.next; //usuwa pierwszy element i wstawia nastepny na szczyt (zastepuje "nowszy" "starszym")
    }

    public void print() {
        Node node = first;
        while (node != null) {
            System.out.println(node.value); //wyswietla first
            node = node.next; //ustawia nastepny w kolejce
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(System.getProperties());
        stack.push(new Node(2));
        stack.push(new Node(6));
        stack.push(new Node(1));
        stack.push(new Node(8));

        stack.print();
    }
}
