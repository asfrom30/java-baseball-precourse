package baseball;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {

    private final String answer;

    Game(String answer) {
        this.answer = answer;
    }

    String infer(String input) {
        // 도메인 로직
        String[] results = this.newInfer(input);

        // 표현
        if (Arrays.stream(results).allMatch(str -> str == "F")) return "낫싱"; // TODO: make Every

        ArrayList<String> resultList = new ArrayList<>();
        long numberOfStrike = Arrays.stream(results).filter(str -> str == "S").count();
        long numberOfBall = Arrays.stream(results).filter(str -> str == "B").count();

        if (0 < numberOfBall) {
            resultList.add(numberOfBall + "볼");
        }

        if (0 < numberOfStrike) {
            resultList.add(numberOfStrike + "스트라이크");
        }

        String string = String.join(" ", resultList);
        return string;
    }

    String[] newInfer(String input) {
        String[] answerStrs = this.answer.split("");
        String[] inputStrs = input.split("");

        String[] temp = new String[3];
        for (int i = 0; i < inputStrs.length; i++) {
            String str = inputStrs[i];
            int index = Arrays.binarySearch(answerStrs, str);

            if (0 <= index) {
                if (i == index) temp[i] = "S";
                else temp[i] = "B";
            } else {
                temp[i] = "F";
            }
        }
        return temp;
    }
}
