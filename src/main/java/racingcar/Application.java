package racingcar;

import racingcar.domain.CarsFactory;
import racingcar.domain.RacingGame;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class Application {
    public static void main(String[] args) {
        String carNames = InputView.getCarNames();
        String rounds = InputView.getRounds();
        RacingGame racingGame = new RacingGame(carNames, rounds);
        while (racingGame.isRacing()) {
            racingGame.race();
            ResultView.print(racingGame.getCars());
        }
        ResultView.printWinner(racingGame.getWinners());
    }
}
