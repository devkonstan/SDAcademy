package lut10.main.java.pl.sda.advanced.introduction;

public class GamepadController {
    // Poprawny sposob deklarowania stalej w jezyku Java
    private static final int ANALOG_TO_RPM_RATIO = 100;

    private final MobileRobot mobileRobot;

    public GamepadController(MobileRobot robot) {
        this.mobileRobot = new MobileRobot();
    }

    public void analogPositionChanged(double xAxis, double yAxis) {
        mobileRobot.move(xAxis * ANALOG_TO_RPM_RATIO, yAxis * ANALOG_TO_RPM_RATIO);
    }
}