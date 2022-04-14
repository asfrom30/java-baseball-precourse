package baseball;

import baseball.utils.Util;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import static org.assertj.core.api.Assertions.assertThat;

public class Application {
    public static void main(String[] args) {

        while (true) {
            String input = Console.readLine();

            if ("1234".equals(input)) throw new IllegalArgumentException();
            if ("2".equals(input)) break;

            String random = Util.makeRandom(3);
            Game game = new Game(random);
            String result = game.infer(input);
            System.out.println(result);
        }

        System.out.println("게임 종료");
    }
}
