package sty26.Sklep;

public class TestSklep {
    public static void main(String[] args) {

        Client klient1 = new Client("chleb");
        Client klient2 = new Client("mięso");
        Client klient3 = new Client("ziemiaki 3");

        klient1.setShopDescription("jajka"); //zmienia wartosc

        Shop sklep =new Shop();
        sklep.addToShopQueue(klient1);
        sklep.addToShopQueue(klient2);
        sklep.addToShopQueue(klient3);
        sklep.doShoping();
        sklep.doShoping();
        sklep.doShoping();
    }
}