package lis25;

public class Wat1 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("czekam 2 sek i jestem watkiem nr 1");

    }

}
