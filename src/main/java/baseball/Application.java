package baseball;

import camp.nextstep.edu.missionutils.Console;

import baseball.constant.ProcessCode;
import baseball.utils.NumberUtil;
import baseball.utils.Util;


public class Application {

    public static void main(String[] args) {

        Game game = Game.createNew();

        while (true) {
            String input = Console.readLine();

            checkValidIfNotThrow(input);

            if (ProcessCode.EXIT.equals(input)) {
                System.out.println("게임 종료");
                break;
            };
            if (ProcessCode.CONTINUE.equals(input)) {
                game = Game.createNew();
            }

            String[] results = game.infer(input);

            String text = View.renderText(results);
            System.out.println(text);
        }

    }

    private static void checkValidIfNotThrow(String input) {
        if (ProcessCode.EXIT.equals(input)) return;
        if (ProcessCode.CONTINUE.equals(input)) return;

        if (input.length() == 3 && NumberUtil.isNumeric(input)) return;

        throw new IllegalArgumentException();
    }
}
