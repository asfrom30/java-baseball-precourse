package baseball.mvc.domain;

import baseball.utils.NumberUtil;
import baseball.utils.RandomUtil;
import baseball.utils.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {

    public static Game createNew() {
        ArrayList<Integer> list = RandomUtil.pickNumbersWithoutDuplicate(3);
        String numbers = StringUtil.from(list);

        Game game = new Game(numbers);
        return game;
    }

    private String[] answers;

    public Game(String answer) {
        this.answers = answer.split("");
    }

    public Score infer(String input) {
        this.checkValidIfNotThrow(input);

        String[] inputs = input.split("");
        Score score = new Score();
        for (int i = 0; i < inputs.length; i++) {
            int foundIndex = Arrays.binarySearch(this.answers, inputs[i]);
            Score.Value scoreValue = this.grade(foundIndex, i);
            score.add(scoreValue);
        }
        return score;
    }

    private Score.Value grade(int foundIndex, int inferIndex) {
        if (foundIndex < 0) return Score.Value.NOTHING;

        if (inferIndex == foundIndex) return Score.Value.STRIKE;
        else return Score.Value.BALL;
    }

    private void checkValidIfNotThrow(String input) {
        if (input.length() == 3 && NumberUtil.isNumeric(input)) return;
        throw new IllegalArgumentException();
    }
}
