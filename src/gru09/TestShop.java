package gru09;

public class TestShop {
    private static Shop kolejka = new Shop();

    public static void main(String[] args) {

        try {
            kolejka.addClient(new Person("Andrzej", "Nowak", 23));
            kolejka.addClient(new Person("Michał", "Kowalski", 18));
            //kolejka.addClient(new Person("Błażej", "Rak", 13));
            kolejka.addClient(new Person("Grzegorz", "Stec", 73));
            kolejka.addClient(new Person("Radek", "Hilc", 23));
            kolejka.addClient(new Person("Sławek", "Kupski", 53));
            kolejka.addClient(new Person("Sławek2", "Kupski2", 63));
        } catch (FullQueueException fqe) {
            System.out.println(fqe.getMessage());

        }

        System.out.println(kolejka);

        System.out.println("*******");

        kolejka.serveCustomer();

        for (Person customer : kolejka.getAll()) { //dlaczego nie wyswietla 1. elementu? -> jak podmienie na peek() to tak
            System.out.println(customer);          //metoda poll sciaga 1.element i nie wyswietla go a peek tylko pokazuje
        }

        System.out.println("*******");

        try {
            kolejka.addClient(new Person("Jan", "Kopeć", 13));
        } catch (IllegalArgumentException | FullQueueException e) {
            System.out.println(e.getMessage());
        }
    }
}
