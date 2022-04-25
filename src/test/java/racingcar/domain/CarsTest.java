package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {

    @Test
    @DisplayName("자동차 경주 우승자 찾기")
    void givenCars_shouldWinner() {
        Car pobi = new Car("pobi", 3);
        Car crong = new Car("crong", 1);
        Car honux = new Car("honux", 2);
        Cars cars = new Cars(Arrays.asList(pobi, crong, honux));
        assertThat(cars.getWinner()).contains(pobi);
    }

    @Test
    @DisplayName("자동차 경주 우승자 여러명 찾기")
    void givenCars_shouldMultipleWinner() {
        Car pobi = new Car("pobi", 3);
        Car crong = new Car("crong", 1);
        Car honux = new Car("honux", 3);
        Cars cars = new Cars(Arrays.asList(pobi, crong, honux));
        assertThat(cars.getWinner()).contains(pobi, honux);
    }
}
