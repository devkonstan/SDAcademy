package list25;

public class Zadanie implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" iteracja nr "+i);
            System.out.println(Thread.currentThread().getState());
            System.out.println(Thread.currentThread().getClass());
        }
    }
}
