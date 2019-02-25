package lis17.Auta;

public class testAuta {
    public static void main(String[] args) {

        Sportowy fura = new Sportowy();
        Ciezarowy tir = new Ciezarowy();
        Terenowy jeep = new Terenowy();
        Cabrio cab = new Cabrio();

        System.out.println(cab.toString());
        System.out.println(cab.osiagi);
        System.out.println(fura.toString());
        System.out.println(fura.osiagi);

        System.out.println(tir.toString());
        System.out.println(tir.ladownosc);
        System.out.println(jeep.toString());
        System.out.println(jeep.duzoBiegow);

        System.out.println("******");
        jeep.jadeWszedzie();

        System.out.println("******");
        cab.jadeSzybko2();

        System.out.println("******");

        BatMobil mobilek = new BatMobil();
        mobilek.jadeSzybko();
    }
}
