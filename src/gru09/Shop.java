package gru09;

import java.util.LinkedList;
import java.util.Queue;

public class Shop {

    private Queue<Person> ListaKolejkowa = new LinkedList<>();

    public void addClient(Person osoba) throws FullQueueException {
        if (ListaKolejkowa.size() < 5) {
            if (osoba.getWiek() < 18) {
                throw new IllegalArgumentException("Underage person: " + osoba.getImie());
            } else
                ListaKolejkowa.add(osoba);
        } else {
            throw new FullQueueException("Cannot be added: " + osoba.getImie());
        }
    }

    //metody
    public Person serveCustomer() {
        return ListaKolejkowa.peek();
    }

    public Queue<Person> getAll() {
        return ListaKolejkowa;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "ListaKolejkowa=" + ListaKolejkowa +
                '}';
    }

}
