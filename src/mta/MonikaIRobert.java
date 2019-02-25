package mta;

class KontoBankowe {
    private int stan = 100;

    public int getStan() {
        return stan;
    }

    public void pobierz(int kwota) {
        stan = stan - kwota;
    }
}

public class MonikaIRobert implements Runnable {
    private KontoBankowe konto = new KontoBankowe();

    public static void main(String[] args) {
        MonikaIRobert zadanie = new MonikaIRobert();
        Thread watek1 = new Thread(zadanie);
        Thread watek2 = new Thread(zadanie);
        watek1.setName("Robert");
        watek2.setName("Monika");
        watek1.start();
        watek2.start();
    }

    public void run() {
        for (int x = 0; x < 10; x++) {
            pobierzGotowke(10);
            if (konto.getStan() < 0) {
                System.out.println("Przekroczenie limitu!");
            }
        }
    }

    private void pobierzGotowke(int kwota) {
        if (konto.getStan() >= kwota) {
            System.out.println(Thread.currentThread().getName() + " ma zamiar pobra? gotówk?.");
            try {
                System.out.println("W?tek " + Thread.currentThread().getName() + " zaraz zostanie u?piony.");
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("W?tek " + Thread.currentThread().getName() + " obudzi? si?.");
            konto.pobierz(kwota);
            System.out.println("W?tek " + Thread.currentThread().getName() + " zako?czy? operacj?.");
        } else {
            System.out.println("Przykro mi, brak ?rodków dla w?tku " + Thread.currentThread().getName());
        }
    }
}

