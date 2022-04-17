package baseball;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import camp.nextstep.edu.missionutils.test.NsTest;

class ApplicationHiddenTest extends NsTest {

    @Test
    @DisplayName("게임을 끝내지 않았는데 1를 입력하면")
    void test1() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("1"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    @DisplayName("게임을 끝내지 않았는데 2를 입력하면")
    void test2() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("2"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }


    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
