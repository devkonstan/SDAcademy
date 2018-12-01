package list25;

public class watek {

//    private int zmienna;

    public static void main(String[] args) {

//        takie wykonanie zajmie sume wszystkich
        new ZadanieNaPliku().run();
        new Zadanie().run();

        //wykonanie obu watkow synchroniczne->jednoczesne
        Thread t1 = new Thread(new Zadanie() {},"watek #1");
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + " iteracja nr " + i);
                }
            }
        }, "watek #2"); //nazwa watku
        t2.start();

        Thread t3 = new Thread(new ZadanieNaPliku() {},"watek 3");
        t3.start();

        try {
            t1.join();
            t2.join(); //wykonanie potrwa najdlzusza dlugosc poj operacji
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
