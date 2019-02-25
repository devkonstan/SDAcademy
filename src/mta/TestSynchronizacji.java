package mta;

public class TestSynchronizacji {
    public static void main(String[] args) {
        TestSynchro zadanie = new TestSynchro();
        Thread watek1 = new Thread(zadanie);
        Thread watek2 = new Thread(zadanie);
        watek1.start();
        watek2.start();
    }

    static class TestSynchro implements Runnable {
        private int stanKonta;

        public synchronized void run() {
            for (int i = 0; i < 50; i++) {
                inkrementuj();
                System.out.println(Thread.currentThread().getName()+" Stan konta wynosi: " + stanKonta);
            }
        }

        public void inkrementuj() {
            int i = stanKonta;
            stanKonta = i + 1;
//            stanKonta++;
        }
    }
}





