package baseball;

import baseball.utils.Util;

import java.util.Arrays;

public class Game {

    private String[] answers;

    public static Game createNew() {
        String numbers = Util.makeRandom(3);
        Game game = new Game(numbers);
        return game;
    }

    Game(String answer) {
        this.answers = answer.split("");
    }

    String[] infer(String input) {
        String[] inputs = input.split("");

        String[] grades = new String[3];
        for (int i = 0; i < inputs.length; i++) {
            int foundIndex = Arrays.binarySearch(this.answers, inputs[i]);
            grades[i] = this.gradeAnswer(foundIndex, i);
        }
        return grades;
    }

    private String gradeAnswer(int foundIndex, int inferIndex) {
        if (foundIndex < 0) return "F";

        if (inferIndex == foundIndex) return "S";
        else return "B";
    }
}
