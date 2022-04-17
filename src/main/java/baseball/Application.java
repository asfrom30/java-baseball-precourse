package baseball;

import baseball.constant.ProcessCode;
import baseball.domain.Game;
import baseball.domain.Score;


public class Application {

    private static boolean isRunning;
    private static Game game;

    public static void main(String[] args) {

        start();

        while (isRunning) {
            String input = Controller.waitUserInput();
            Score score = game.infer(input);
            View.render(score);

            waitUserTypeProcessCodeWhen(score.isPerfect());
        }
        View.render(View.GAME_EXIT_MESSAGE);
    }

    private static void start() {
        isRunning = true;
        game = Game.createNew();
    }

    private static void stop() {
        isRunning = false;
    }

    private static void restart() {
        game = Game.createNew();
    }

    private static void waitUserTypeProcessCodeWhen(boolean flag) {
        if(!flag) return;

        View.render(View.ASK_RESTART_OR_EXIT_MESSAGE);

        String input = Controller.waitUserInput();

        if(!ProcessCode.isValid(input)) throw new IllegalArgumentException();

        if (ProcessCode.EXIT.equals(input)) Application.stop();
        else if (ProcessCode.CONTINUE.equals(input)) Application.restart();
    }
}
