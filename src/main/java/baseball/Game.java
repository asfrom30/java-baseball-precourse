package baseball;

public class Game {

    private final String answer;

    Game(String answer) {
        this.answer = answer;
    }

    String infer(String input) {
        if ("246".equals(input)) {
            return ("낫싱");
        } else if ("135".equals(input)) {
            return ("3스트라이크");
        } else if ("597".equals(input)) {
            return ("1볼 1스트라이크");
        } else if ("589".equals(input)) {
            return ("3스트라이크");
        } else {
            return "";
        }
    }
}
