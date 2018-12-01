package list25;

public class watki {
    public static int STAT_ZM=1;
    private int zmienna;

    public static void main(String[] args) {
        System.out.println("stat zmienna "+watki.STAT_ZM);

        //jednoczesne wykonanie
        new Wat1().run();
        new Wat2(2,3).run();

        //synchroniczne wykonanie ->jednoczesne
        Thread w1=new Thread(new Wat1());
        w1.start(); //tu jest opoznienie

        Thread w2=new Thread(new Wat2(5,7));
        w2.start();
        System.out.println(watki.STAT_ZM);

        Thread t4=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    watki.STAT_ZM=5;
                    System.out.println(STAT_ZM);
                }
            }
        });
        t4.start();
        System.out.println(watki.STAT_ZM); //dlaczego wyswietla sie tutaj (przed t4)?
        //join sprawia ze watki ida jeden po drugim (asynchronicznie)
    }
    //po wykonaniu wszystkich run() dopiero ida start()
}
