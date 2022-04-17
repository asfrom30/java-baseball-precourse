package units.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import baseball.utils.ArrayUtil;

public class ArrayUtilTest {


    @Test
    @DisplayName("Success Case")
    public void everyTest() {
        boolean bool = ArrayUtil.every(new String[]{"A", "A"}, "A");
        assertThat(bool).isEqualTo(true);
    }

    @Test
    @DisplayName("Failed Case")
    public void everyTest2() {
        boolean bool = ArrayUtil.every(new String[]{"A", "B"}, "A");
        assertThat(bool).isEqualTo(false);
    }

}
