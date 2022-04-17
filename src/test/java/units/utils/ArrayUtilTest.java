package units.utils;

import baseball.domain.Score;
import baseball.utils.ArrayUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayUtilTest {

    class Something {
        private String value;
        public Something(String value) {
            this.value = value;
        }

        public boolean isEqual(String string) {
            return this.value == string;
        }
    }


    @Test
    @DisplayName("every(), count(), some()")
    public void test() {
        Something something1 = new Something("A");
        Something something2 = new Something("A");
        Something[] somethings =  new Something[]{something1, something2};

        assertThat(ArrayUtil.every(somethings, (item) -> item.isEqual("A"))).isEqualTo(true);
        assertThat(ArrayUtil.count(somethings, (item) -> item.isEqual("A"))).isEqualTo(2);
        assertThat(ArrayUtil.some(somethings, (item) -> item.isEqual("A"))).isEqualTo(true);
    }

    @Test
    @DisplayName("every(), count(), some()")
    public void test2() {
        Something something1 = new Something("A");
        Something something2 = new Something("B");
        Something[] somethings =  new Something[]{something1, something2};

        assertThat(ArrayUtil.every(somethings, (item) -> item.isEqual("A"))).isEqualTo(false);
        assertThat(ArrayUtil.count(somethings, (item) -> item.isEqual("A"))).isEqualTo(1);
        assertThat(ArrayUtil.some(somethings, (item) -> item.isEqual("A"))).isEqualTo(true);
        assertThat(ArrayUtil.some(somethings, (item) -> item.isEqual("C"))).isEqualTo(false);
    }

}
