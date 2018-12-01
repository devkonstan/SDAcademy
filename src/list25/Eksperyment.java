package list25;

public class Eksperyment {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Runnable zadanie = new Runnable() {
            @Override
            public void run() { //definicja watku
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        zadanie.run();
        zadanie.run();
        zadanie.run();

        Thread t1 = new Thread(zadanie);
        Thread t2 = new Thread(zadanie);
        Thread t3 = new Thread(zadanie);

        //odpalamy watki; start() tworzy watek i uruchamia kod w metodzie run()
//        t1.start();
//        t2.start();
//        t3.start();

//        try {
//            t1.join();
//            t2.join();
//            t3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("time: " + ((System.currentTimeMillis() - start)));
    }
}
