package baseball;

import baseball.utils.ArrayUtil;

import java.util.ArrayList;

public class View {

    public static void render(String str) {
        System.out.println(str);
    }

    static String renderText(Scores scores) {
        String[] grades = scores.getValues();

        if(ArrayUtil.every(grades, "F")) return "낫싱";

        ArrayList<String> textList = new ArrayList<>();

        int numberOfBall = ArrayUtil.count(grades, "B");
        if (0 < numberOfBall) {
            textList.add(numberOfBall + "볼");
        }

        int numberOfStrike = ArrayUtil.count(grades, "S");
        if (0 < numberOfStrike) {
            textList.add(numberOfStrike + "스트라이크");
        }

        return String.join(" ", textList);
    }
}
