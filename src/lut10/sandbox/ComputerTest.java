package lut10.main.java.pl.sda.advanced.sandbox;

import lut09.advanced.sandbox.Computer;
import lut09.advanced.sandbox.Keyboard;
import lut09.advanced.sandbox.Mouse;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.anyChar;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ComputerTest {
    private lut09.advanced.sandbox.Computer computer;
    private lut09.advanced.sandbox.Keyboard keyboard;

    @Mock
    private Mouse mouse;

    @Before
    public void setUp() {
        keyboard = Mockito.mock(Keyboard.class);
//        mouse = Mockito.mock(Mouse.class);
        computer = new Computer(mouse, keyboard);
    }

    @Test
    public void methodOpenShouldRunMethodClick2Times() {
        computer.open();
        verify(mouse, times(2)).click();
    }

    @Test
    public void typingTest() {
        String text = "DupaDupa";
        computer.type(text);
        verify(keyboard, times(text.length())).pressKey(anyChar());

//        Computer komp=new Computer(mouse,new Keyboard());
//        komp.type("Dupa");
    }


}
