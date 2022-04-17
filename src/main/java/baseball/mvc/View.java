package baseball.mvc;

import baseball.mvc.domain.Score;

import java.util.ArrayList;

public class View {

    public static String ASK_RESTART_OR_EXIT_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    public static String GAME_EXIT_MESSAGE = "게임 종료";

    public static void render(String str) {
        System.out.println(str);
    }

    public static void render(Score score) {
        String message = View.buildMessage(score);
        System.out.println(message);
    }

    private static String buildMessage(Score score) {
        if(score.isPerfectNothing())  return "낫싱";

        ArrayList<String> textList = new ArrayList<>();

        int numberOfBall = score.countBall();
        if (0 < numberOfBall) textList.add(numberOfBall + "볼");

        int numberOfStrike = score.countStrike();
        if (0 < numberOfStrike) textList.add(numberOfStrike + "스트라이크");

        String text = String.join(" ", textList);
        return text;
    }
}
