package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class IO {

    public String input() {
        return Console.readLine();
    }

    public String inputRestart() {
        return Console.readLine();
    }

    public void printExceptionMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(List<String> strikeAndBall) {
        String message = String.format("%s볼 %s스트라이크", strikeAndBall.get(1), strikeAndBall.get(0));
        System.out.println(message);
    }


    public void printNotMatch() {
        System.out.println("낫싱");
    }

    public void startMessage() {
        System.out.println("숫자를 입력하세요 : ");
    }

    public void printSuccessMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void gameRestartMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    }


}
