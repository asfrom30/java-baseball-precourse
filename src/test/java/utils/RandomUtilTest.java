package utils;

import baseball.utils.RandomUtil;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RandomUtilTest {

    @Test
    public void makeRandomTest() {
        // NOTE: 앞에서 호출했기 때문에 984 부터 시작하는듯
        String result = RandomUtil.makeRandom(3);
        assertThat(result.length()).isEqualTo(3);
    }

    @Test
    public void makeRandomTest2() {
        String result = RandomUtil.makeRandom(4);
        assertThat(result.length()).isEqualTo(4);
    }

}
