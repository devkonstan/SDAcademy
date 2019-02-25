package lut10.test.java.pl.sda.advanced.sandbox;

import lut10.main.java.pl.sda.advanced.sandbox.Computer;
import lut10.main.java.pl.sda.advanced.sandbox.Keyboard;
import lut10.main.java.pl.sda.advanced.sandbox.Mouse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ComputerTests {


    @Mock //dzieki temu korzystamy z atrapy
    private Mouse myszka;
    private Keyboard klawka;
    private Computer komp;

    @Before
    public void setUp() {
        klawka = Mockito.mock(Keyboard.class);
        komp = new Computer(myszka, klawka);
    }

    @Test
    public void proofClick() {
        Mouse myszka = new Mouse();
        myszka.click();
    }

    @Test
    public void proofOpen() {
        Computer komp = new Computer(myszka, klawka);
        komp.open();
    }

    @Test
    public void mouseShouldBeClickedTwiceWhenOpenIsExecuted() {
        // given
        final int expectedAmoutOfClicks = 2;

        // when
        komp.open();

        // then
        verify(myszka, times(expectedAmoutOfClicks)).click();
        verify(myszka, atLeastOnce()).click();
        verify(myszka, atMost(expectedAmoutOfClicks)).click();
    }

    @Test
    public void typeTextShouldInvokePressKeyForEveryCharacterInTheText() {
        // given
        final String textToBeTyped = "Some text to be tested";

        // when
        komp.typeText(textToBeTyped);

        // then
        verify(klawka, times(textToBeTyped.length())).pressKey(anyChar());
        verify(klawka, atLeastOnce()).pressKey(anyChar());
        verify(klawka, atMost(textToBeTyped.length())).pressKey(anyChar());
    }



}
