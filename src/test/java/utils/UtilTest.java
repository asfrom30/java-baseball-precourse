package utils;

import baseball.utils.Util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class UtilTest {

    @Test
    public void makeRandomTest() {
        // NOTE: 앞에서 호출했기 때문에 984 부터 시작하는듯
        String result = Util.makeRandom(3);
        assertThat(result.length()).isEqualTo(3);
    }

    @Test
    public void makeRandomTest2() {
        String result = Util.makeRandom(4);
        assertThat(result.length()).isEqualTo(4);
    }

}
