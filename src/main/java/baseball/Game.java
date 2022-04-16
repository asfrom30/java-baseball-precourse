package baseball;

import baseball.utils.RandomUtil;

import java.util.Arrays;

public class Game {

    private String[] answers;

    public static Game createNew() {
        String numbers = RandomUtil.makeRandom(3);
        Game game = new Game(numbers);
        return game;
    }

    public Game(String answer) {
        this.answers = answer.split("");
    }

    public Scores infer(String input) {
        String[] inputs = input.split("");

        Scores scores = new Scores();
        for (int i = 0; i < inputs.length; i++) {
            int foundIndex = Arrays.binarySearch(this.answers, inputs[i]);
            String score = this.grade(foundIndex, i);
            scores.add(score);
        }
        return scores;
    }

    private String grade(int foundIndex, int inferIndex) {
        if (foundIndex < 0) return "F";

        if (inferIndex == foundIndex) return "S";
        else return "B";
    }
}
