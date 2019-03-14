package lut16.behavioral.strategy_and_mediator;

public class Robot { //jest Contextem ze schematu

    private Position currentPosition;
    private IController controller;

    public Robot(Position currentPosition, IController controller) {
        this.currentPosition = currentPosition;
        this.controller = controller;
    }

    public Robot(Keyboard keyboard) {
    }

    public void updatePosition(Position position) {
        currentPosition = position;
    }

    public void move() {
        ControllerData controllerData = controller.readControllerData();
        //logika sterowania robotem
    }

    public void changeController(IController newController) {
        controller = newController;
    }
}
