package lis25;

public class Watki {
    public static int STAT_ZM = 1;
    private int zmienna;

    public static void main(String[] args) {
        System.out.println("statyczna zmienna: " + Watki.STAT_ZM);
        System.out.println("******");

        //wykonanie jedno po drugim -> asynchroniczne
        new Wat2(2, 3).run();
        new Wat1().run();
        System.out.println("******");

        //jednoczesne wykonanie -> synchroniczne, ale t1 pokaze, sie po 2 sek
        //5
        Thread t1 = new Thread(new Wat1());
        t1.start(); //wywoluje metode run() w t1 bedacym obiektem Wat1
        //2
        Thread t2 = new Thread(new Wat2(5, 7));
        t2.start();
        //1
        System.out.println("statyczna zmienna: " + Watki.STAT_ZM); //pokaze sie przed utworzeniem obu watkow

        //4
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    Watki.STAT_ZM = 5;
                    System.out.println(STAT_ZM);
                }
            }
        });

        t4.start();

        //3
        System.out.println("TERAZ"); //dlaczego wyswietla sie przed t4, ale po t2?

    }

}
