package lut10.sandbox;


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
    private lut10.sandbox.Computer computer;
    private lut10.sandbox.Keyboard keyboard;

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
        computer.typeText(text);
        verify(keyboard, times(text.length())).pressKey(anyChar());

//        Computer komp=new Computer(mouse,new Keyboard());
//        komp.type("Dupa");
    }


}
