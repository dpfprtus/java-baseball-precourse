package baseball;

import baseball.controller.GameRunner;
import baseball.model.GenerateNumber;
import baseball.validator.Validate;
import baseball.view.IO;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        GameRunner gameRunner = new GameRunner(new Validate(),new GenerateNumber(),new IO());
        gameRunner.run();
    }
}
