package baseball.controller;

import static java.lang.System.exit;

import baseball.model.GenerateNumber;
import baseball.validator.Validate;
import baseball.view.IO;
import java.util.List;

public class GameRunner {

    private final Validate validator;
    private final GenerateNumber generateNumber;
    private final IO io;

    public GameRunner(Validate validate, GenerateNumber generateNumber, IO io) {
        this.validator = validate;
        this.generateNumber = generateNumber;
        this.io = io;
    }

    public void run() {

        List<String> answer = generateNumber.generate();

        while (true) {
            List<String> resultList = getResultList(answer);

            String strikeCount = resultList.get(0);

            if (validator.isNothing(resultList)) {
                io.printNotMatch();
                continue;
            }

            if (validator.isStrikeCount3(strikeCount)) {
                io.printSuccessMessage();
                io.gameRestartMessage();
                String input = io.inputRestart();
                if (validator.isGameRestartNumber(input)) {
                    continue;
                }
                return;
            }
            io.printMessage(resultList);

        }
    }

    private List<String> getResultList(List<String> answer) {
        io.startMessage();
        String inputNumber = io.input();

        validateException(inputNumber);
        return validator.validateUserInputNumberAndAnswer(inputNumber, answer);
    }

    private void validateException(String inputNumber) {
        try {
            validator.validateIsUserInputNumber(inputNumber);
            validator.validateIsLength3(inputNumber);
        } catch (IllegalArgumentException e) {
            io.printExceptionMessage(e.getMessage());
            exit(0);
        }
    }
}
