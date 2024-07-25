package baseball;

import static java.lang.System.exit;

import java.util.List;

public class GameRunner {
    Validate validator = new Validate();
    GenerateNumber generateNumber = new GenerateNumber();
    IO io = new IO();

    public void run() {

        List<String> answer = generateNumber.generate();

        while (true) {
            io.startMessage();
            String inputNumber = io.input();

            validateException(inputNumber);
            List<String> resultList = validator.validateUserInputNumberAndAnswer(inputNumber, answer);

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
