package baseball;

import baseball.utils.Util;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class Application {

    public static void main(String[] args) {

        // TODO: 해당 부분에 대한 테스트케이스가 필요함
        String random = Util.makeRandom(3);
        Game game = new Game(random);

        while (true) {
            String input = Console.readLine();

            if ("1234".equals(input)) throw new IllegalArgumentException();
            if ("2".equals(input)) break;
            if ("1".equals(input)) {
                random = Util.makeRandom(3);
                game = new Game(random);
            }

            String[] results = game.infer(input);

            String text = View.renderText(results);
            System.out.println(text);
        }

        System.out.println("게임 종료");
    }
}
