package sty12;

import java.util.concurrent.TimeUnit;

public class Watek {
    public static void main(String[] args) {
        Zadanie[] zadania = new Zadanie[5];
        zadania[0] = new Zadanie("Pracownik A");
        zadania[1] = new Zadanie("Pracownik B");
        zadania[2] = new Zadanie("Pracownik C");
        zadania[3] = new Zadanie("Pracownik D");
        zadania[4] = new Zadanie("Pracownik E");

        for (Zadanie zadanie : zadania) {
            new Thread(zadanie).start();
        }

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (Zadanie zadanie : zadania) {
            zadanie.wylacz();
        }
    }

}

class Zadanie implements Runnable {

    private String nazwa;
    private boolean aktywny = true; //flaga

    public Zadanie(String nazwa) {

        this.nazwa = nazwa;
    }

    public void wylacz() {
        System.out.println(this.nazwa + " : 16:00 - idę do domu!");
        this.aktywny = false;
    }

    @Override
    public void run() {
        while (this.aktywny) { //domyslnie true
            System.out.println(this.nazwa + " : pracuje!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

