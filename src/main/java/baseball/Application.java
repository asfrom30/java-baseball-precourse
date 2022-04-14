package baseball;

import camp.nextstep.edu.missionutils.Console;

import baseball.constant.ProcessCode;
import baseball.utils.NumberUtil;
import baseball.utils.Util;


public class Application {

    public static void main(String[] args) {

        // TODO: 해당 부분에 대한 테스트케이스가 필요함
        String random = Util.makeRandom(3);
        Game game = new Game(random);

        while (true) {
            String input = Console.readLine();

            checkValidIfNotThrow(input);

            if (ProcessCode.EXIT.equals(input)) break;
            if (ProcessCode.CONTINUE.equals(input)) {
                random = Util.makeRandom(3);
                game = new Game(random);
            }

            String[] results = game.infer(input);

            String text = View.renderText(results);
            System.out.println(text);
        }

        System.out.println("게임 종료");
    }

    private static void checkValidIfNotThrow(String input) {
        if (ProcessCode.EXIT.equals(input)) return;
        if (ProcessCode.CONTINUE.equals(input)) return;

        if (input.length() == 3 && NumberUtil.isNumeric(input)) return;

        throw new IllegalArgumentException();
    }
}
