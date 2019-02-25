package lis25;

public class TestZadania {

//    private int zmienna;

    public static void main(String[] args) {

        //takie wykonanie zajmie sume wszystkich
       new ZadanieNaPliku().run();
       new Zadanie().run();

        //wykonanie obu watkow synchroniczne -> jednoczesnie
        Thread t1 = new Thread(new Zadanie() {},"TestZadania #1");
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + " iteracja nr " + i);
                }
            }
        }, "TestZadania #2"); //nazwa watku
        t2.start();

        Thread t3 = new Thread(new ZadanieNaPliku() {},"TestZadania 3");
        t3.start();

        try {
            t1.join();
            t2.join(); //wykonanie potrwa najdluzsza dlugosc poj operacji
            t3.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("koniec");

    }

//    synchronized void mojaKlasa() {
//        zmienna = 1;
//    }
}
