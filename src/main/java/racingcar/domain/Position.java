package racingcar.domain;

import java.util.Objects;

public class Position {

    private int position;

    public Position() {
        this(0);
    }

    public Position(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("[ERROR] 위치 값은 0보다 작을 수 없습니다.");
        }
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    void moveForward() {
        position++;
    }

    public Position maxPosition(Position position) {
        if (this.position >= position.getPosition()) {
            return this;
        }
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    public String toString() {
        return "Position{" + "position=" + position + '}';
    }
}
