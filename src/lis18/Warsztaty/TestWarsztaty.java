package lis18.Warsztaty;

public class TestWarsztaty {
    public static void main(String[] args) {
        Samochod ZepsuteAuto_1 = new Samochod();
        Samochod ZepsuteAuto_2 = new Samochod();

        WarsztatA warA = new WarsztatA();
        System.out.println("Warsztat A");
        warA.naprawiamKaroserie(ZepsuteAuto_1);
        warA.naprawiamPodwozie(ZepsuteAuto_1);

        WarsztatB warB = new WarsztatB();
        System.out.println("Warsztat B");
        warB.naprawiamKaroserie(ZepsuteAuto_2);
        warB.naprawiamPodwozie(ZepsuteAuto_2);

        System.out.println("Auto 1");
        System.out.println(ZepsuteAuto_1.karoseria);
        System.out.println(ZepsuteAuto_1.podwozie);

        System.out.println("Auto 2");
        System.out.println(ZepsuteAuto_2.karoseria);
        System.out.println(ZepsuteAuto_2.podwozie);


    }
}
