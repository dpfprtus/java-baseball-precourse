package baseball;

import java.util.List;
import java.util.Objects;

public class Validate {
    public void validateIsUserInputNumber(String input) {
        try {
            Integer.parseInt(input);
        } catch (IllegalArgumentException e) {

            throw new IllegalArgumentException("숫자만 입력 가능합니다.");
        }
    }

    public void validateIsLength3(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException("입력 길이가 3이 아닙니다.");
        }
    }


    public boolean isNothing(List<String> input) {
        return Objects.equals(input.get(0), "0") && Objects.equals(input.get(1), "0");
    }

    public List<String> validateUserInputNumberAndAnswer(String input, List<String> answer) {
        int strike = 0;
        int ball = 0;
        for (String s : answer) {
            if (input.contains(s)) {
                if (input.indexOf(s) == answer.indexOf(s)) {
                    strike += 1;
                    continue;
                }
                ball += 1;
            }
        }
        return List.of(String.valueOf(strike), String.valueOf(ball));
    }

    public boolean isStrikeCount3(String input) {
        return input.equals("3");
    }


    public boolean isGameRestartNumber(String input) {
        return input.equals("1");
    }
}
