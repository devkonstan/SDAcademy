package lut10.test.java.pl.sda.advanced.introduction;

import lut10.main.java.pl.sda.advanced.introduction.GamepadController;
import lut10.main.java.pl.sda.advanced.introduction.MobileRobot;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.anyDouble;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTests {
    private GamepadController pad;

    private MobileRobot robot; //mockujemy zaleznosci a nie klasy tworzace

    @Before
    public void setUp() {
        // robot = Mockito.mock(MobileRobot.class);
        pad = new GamepadController(robot);
    }

    @Test
    public void testIfPosChanged() {
        //Given

        //When
        pad.analogPositionChanged(5,10);

        //Then
        Mockito.verify(robot,Mockito.times(1)).move(anyDouble(),anyDouble());
    }
}
