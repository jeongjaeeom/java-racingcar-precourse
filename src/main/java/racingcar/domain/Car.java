package racingcar.domain;

public class Car {

    public static final int BOUNDARY_NUMBER = 4;

    private final String name;
    private int position;
    public Car(String name) {
        if (name == null || name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 자동차명은 5글자를 초과할 수 없습니다.");
        }
        this.name = name;
    }

    public void move(int number) {
        if (number < BOUNDARY_NUMBER) {
            return;
        }
        this.position++;
    }

    public int getPosition() {
        return position;
    }
}
