package racingcar.domain;

import java.util.List;

public class RacingGame {

    private final Cars cars;
    private int rounds;

    public RacingGame(String carNames, String rounds) {
        this(carNames, parseInt(rounds));
    }

    public RacingGame(String carNames, int rounds) {
        this.cars = new Cars(CarsFactory.of(carNames));
        this.rounds = rounds;
    }

    public void race() {
        cars.move();
        finishPerRound();
    }

    public boolean isRacing() {
        return this.rounds > 0;
    }

    public List<Car> getCars() {
        return cars.getCars();
    }

    public List<Car> getWinners() {
        return cars.getWinner();
    }

    private void finishPerRound() {
        this.rounds--;
    }

    private static int parseInt(String rounds) {
        try {
            return Integer.parseInt(rounds);
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("[ERROR] 자동차 게임 횟수는 숫자만 가능합니다.");
        }
    }
}
