package list17;

public class testAuta {
    public static void main(String[] args) {

        Sportowy mazda = new Sportowy();
        Ciezarowy tir = new Ciezarowy();
        Terenowy jeep = new Terenowy();
        Cabrio fura=new Cabrio();

        System.out.println(mazda.toString());
        System.out.println(mazda.osiagi);
        System.out.println(tir.toString());
        System.out.println(tir.ladownosc);
        System.out.println(jeep.toString());
        System.out.println(jeep.duzoBiegow);
        System.out.println("******");
        jeep.jadeWszedzie();
        System.out.println("******");
        fura.jadeSzybko2();
        System.out.println("******");

        BatMobil mobilek = new BatMobil();
        mobilek.jadeSzybko();
    }
}
