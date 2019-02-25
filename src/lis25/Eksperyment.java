package lis25;

public class Eksperyment {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Runnable zadanie = new Runnable() {
            @Override
            public void run() { //definicja watku rozniajaca sie od domyslnego run()
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // te zadania wystartuja jednoczesnie
        zadanie.run(); //trwa 2 sekundy
        zadanie.run();
        zadanie.run();

        // dzieki zastosowaniu watkow uzyskamy odmienny efekt
        Thread t1 = new Thread(zadanie);
        Thread t2 = new Thread(zadanie);
        Thread t3 = new Thread(zadanie);

        // odpalamy Watki -> start() uruchamia kod w metodzie run()
        t1.start();
        t2.start();
        t3.start();

        // join wydluza okres wykonania, bo laczy Watki 1 po 2 -> 8 sekund
        //powoduje, że aktualnie uruchomione wątki przestają być wykonywane, dopóki wątek t1 nie zakończy swojego zadania.
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("time: " + ((System.currentTimeMillis() - start)));
    }
}
