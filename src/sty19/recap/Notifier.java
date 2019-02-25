package sty19.recap;

public class Notifier implements Runnable {
    private final String name; //dlaczego final?
    private final int numberOfRepeats;

    public Notifier(String name, int numberOfRepeats) {
        this.name = name;
        this.numberOfRepeats = numberOfRepeats;
    }

    public void run() { //do czego sluzy metoda run?
        for (int i = 0; i < numberOfRepeats; i++) {
            System.out.println("hello from thread named "+name);

        }
    }
}
