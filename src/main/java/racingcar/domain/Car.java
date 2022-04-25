package racingcar.domain;

public class Car {

    public static final int MOVE_FORWARD_NUMBER = 4;

    private final CarName name;
    private int position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new CarName(name);
        this.position = position;
    }

    public void move(int number) {
        if (number >= MOVE_FORWARD_NUMBER) {
            this.position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name.getName();
    }
}
