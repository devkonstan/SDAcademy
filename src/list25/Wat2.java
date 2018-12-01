package list25;

public class Wat2 implements Runnable {
    int a;
    int b;

    Wat2(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        int c=a+b;
        System.out.println("wynik wynosi "+c);
    }

}
