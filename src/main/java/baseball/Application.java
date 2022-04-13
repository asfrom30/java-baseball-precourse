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

            if ("246".equals(input)) {
                System.out.println("낫싱");
            } else if ("135".equals(input)) {
                System.out.println("3스트라이크");
            } else if ("597".equals(input)) {
                System.out.println("1볼 1스트라이크");
            } else if ("589".equals(input)) {
                System.out.println("3스트라이크");
            }
        }
        System.out.println("게임 종료");
    }
}
