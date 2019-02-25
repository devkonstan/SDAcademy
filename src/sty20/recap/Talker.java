package sty20.recap;

public class Talker implements Runnable {

    private final String name;
    private final int numberOfRepeats;

    public Talker(String name, int numberOfRepeats) {
        this.name = name;
        this.numberOfRepeats = numberOfRepeats;
    }

    @Override
    public void run() {
        for(int i = 0; i < numberOfRepeats; i++) {
            System.out.println(String.format("Hello from %s", name));
        }
    }
}
