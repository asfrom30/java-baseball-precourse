package baseball;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTestExtra extends NsTest {
    @Test
    @DisplayName("여러 가지 숫자를 넣어서 게임 로직 맞는지 검증")
    void test() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("246", "131",  "777", "000", "513", "135", "2");
                    assertThat(output()).contains("낫싱", "2스트라이크", "낫싱", "낫싱", "3볼", "3스트라이크", "게임 종료");

                },
                1, 3, 5, 5, 8, 9
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
