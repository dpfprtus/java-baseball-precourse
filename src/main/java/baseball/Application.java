package baseball;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        GameRunner gameRunner = new GameRunner(new Validate(),new GenerateNumber(),new IO());
        gameRunner.run();
    }
}
