package racingcar.domain;

public class Car {

    public static final int MOVE_FORWARD_NUMBER = 4;

    private final String name;
    private int position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        if (name == null || name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 자동차명은 5글자를 초과할 수 없습니다.");
        }
        this.name = name;
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
        return name;
    }
}
