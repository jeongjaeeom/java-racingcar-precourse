package racingcar.domain;

public class Car {

    private final String name;

    public Car(String name) {
        if (name == null || name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 자동차명은 5글자를 초과할 수 없습니다.");
        }
        this.name = name;
    }

}
