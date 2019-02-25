package lut10.main.java.pl.sda.advanced.sandbox;

public class Computer {
    private final Mouse myszka;
    private final Keyboard klawka;


    public Computer(Mouse myszka, Keyboard klawka) {
        this.myszka = myszka;
        this.klawka = klawka;
    }


    public void typeText(String tekst) {
        for (int i = 0; i < tekst.length(); i++) {
            klawka.pressKey(tekst.charAt(i));

        }
    }

    public void open() {
        myszka.click();
        myszka.click();
    }
}
