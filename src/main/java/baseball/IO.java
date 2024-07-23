package baseball;

import camp.nextstep.edu.missionutils.Console;

public class IO {

    public void input() {
        String inputNumber = Console.readLine();
    }

    public void validate(String input) {
        try {
            Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            System.exit(0);
        }
    }

}
