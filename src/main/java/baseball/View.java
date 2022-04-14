package baseball;

import baseball.utils.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class View {

    static String renderText(String[] grades) {
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
