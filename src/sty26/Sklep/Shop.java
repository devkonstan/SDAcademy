package sty26.Sklep;

import java.util.*;

public class Shop {
        //interfejs <typ>  nazwa s.d.
//    private Queue<Client> kolejka = Collections.asLifoQueue(new LinkedList<>()); //
    private Deque<Client> kolejka = new LinkedList<>();
    public void addToShopQueue(Client client) {

        kolejka.add(client);
    }

    public void doShoping() {
        Client client = kolejka.remove();
        System.out.println("obslugujemy: "+client.getShopDescription());
    }
}
