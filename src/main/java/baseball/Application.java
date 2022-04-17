package baseball;

import baseball.system.ProcessCode;
import baseball.mvc.Controller;
import baseball.mvc.View;
import baseball.mvc.domain.Game;
import baseball.mvc.domain.Score;


public class Application {

    private static boolean isRunning;
    private static Game game;

    public static void main(String[] args) {

        start();
        while (isRunning) {
            Score score = runOnce();
            View.render(score);
            askStopRunningToUserWhen(score.isPerfect());
        }
        destroyed();
    }

    private static void start() {
        isRunning = true;
        game = Game.createNew();
    }

    private static Score runOnce(){
        String input = Controller.waitUserInput();
        Score score = game.infer(input);
        return score;
    }

    private static void stop() {
        isRunning = false;
    }

    private static void restart() {
        game = Game.createNew();
    }

    private static void destroyed() {
        View.render(View.GAME_EXIT_MESSAGE);
    }

    private static void askStopRunningToUserWhen(boolean flag) {
        if(!flag) return;

        View.render(View.ASK_RESTART_OR_EXIT_MESSAGE);
        waitUserTypeProcessCode();
    }

    private static void waitUserTypeProcessCode() {
        String input = Controller.waitUserInput();

        if(!ProcessCode.isValid(input)) throw new IllegalArgumentException();

        if (ProcessCode.EXIT.equals(input)) Application.stop();
        else if (ProcessCode.CONTINUE.equals(input)) Application.restart();
    }
}
