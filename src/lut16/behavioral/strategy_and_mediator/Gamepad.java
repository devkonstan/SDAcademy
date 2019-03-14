package lut16.behavioral.strategy_and_mediator;

public class Gamepad implements IController {
    @Override
    public ControllerData readControllerData() {
        System.out.println("Driving with gamepad");
        return new ControllerData(50,50); //na srodek
    }
}
