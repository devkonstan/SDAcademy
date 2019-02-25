package sty20.recap;

public class Task5Demo {
    public static void main(String[] args) {
        Talker talker1 = new Talker("John Doe", 10);
        Talker talker2 = new Talker("Robert Smith", 10);

        Thread thread1 = new Thread(talker1);
        Thread thread2 = new Thread(talker2);

        thread1.start();
        thread2.start();
    }
}
