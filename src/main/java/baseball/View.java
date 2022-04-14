package baseball;

import java.util.ArrayList;
import java.util.Arrays;

public class View {

    static String renderText(String[] results) {
        if (Arrays.stream(results).allMatch(str -> str == "F")) return "낫싱";

        ArrayList<String> resultList = new ArrayList<>();
        long numberOfStrike = Arrays.stream(results).filter(str -> str == "S").count();
        long numberOfBall = Arrays.stream(results).filter(str -> str == "B").count();

        if (0 < numberOfBall) {
            resultList.add(numberOfBall + "볼");
        }

        if (0 < numberOfStrike) {
            resultList.add(numberOfStrike + "스트라이크");
        }

        return String.join(" ", resultList);
    }
}
