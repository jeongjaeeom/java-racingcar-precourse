package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    @DisplayName("자동차 이름 비어있지 않고 5글자 이상일 경우 예외 발생")
    void givenCarName_shouldNotEmptyAndFiveWord() {
        assertThatThrownBy(() -> new Car("내차는다섯글자가넘어요"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
