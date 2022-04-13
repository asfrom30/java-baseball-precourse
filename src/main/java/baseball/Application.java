package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class Application {
    public static void main(String[] args) {

        while (true) {
            String input = Console.readLine();

            if ("1234".equals(input)) throw new IllegalArgumentException();
            if ("2".equals(input)) break;

            String result = BaseBall.infer(input);
            System.out.println(result);
        }

        System.out.println("게임 종료");
    }
}
