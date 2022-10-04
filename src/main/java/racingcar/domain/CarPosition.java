package racingcar.domain;

public class CarPosition {

    private int position;

    int getPosition() {
        return position;
    }

    public void action(ControlType controlType) {
        position += controlType.getDistance();
    }
}
