package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    @DisplayName("자동차 이름 비어있지 않고 5글자 이상일 경우 예외 발생")
    void givenCarName_shouldNotEmptyAndFiveWord() {
        assertThatThrownBy(() -> new Car("내차는다섯글자가넘어요", 3))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("자동차 전진")
    void givenNumber_shouldMoveForward() {
        Car car = new Car("tesla");
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("자동차 멈춤")
    void givenNumber_shouldStop() {
        Car car = new Car("tesla");
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
