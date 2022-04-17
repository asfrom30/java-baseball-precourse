package units.utils;

import baseball.domain.Score;
import baseball.utils.ArrayUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayUtilTest2 {


    @Test
    @DisplayName("Success Case")
    public void everyTest() {
        Score.Value[] arr = new Score.Value[]{Score.Value.BALL, Score.Value.BALL};
        boolean bool = ArrayUtil.every(arr, (item) -> item == Score.Value.BALL);
        assertThat(bool).isEqualTo(true);

        int count = ArrayUtil.count(arr, (item) -> item == Score.Value.BALL);
        assertThat(count).isEqualTo(2);
    }

    @Test
    @DisplayName("Failed Case")
    public void everyTest2() {
        Score.Value[] arr = new Score.Value[]{Score.Value.BALL, Score.Value.STRIKE};
        boolean bool = ArrayUtil.every(arr, (item) -> item == Score.Value.BALL);
        assertThat(bool).isEqualTo(false);

        int count = ArrayUtil.count(arr, (item) -> item == Score.Value.BALL);
        assertThat(count).isEqualTo(1);
    }

}
