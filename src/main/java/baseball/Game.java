package baseball;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {

    private final String answer;

    Game(String answer) {
        this.answer = answer;
    }

    String[] infer(String input) {
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
