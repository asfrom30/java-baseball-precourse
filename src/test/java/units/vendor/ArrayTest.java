package units.vendor;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

public class ArrayTest {

    @Test
    public void findIndex() {
        String[] strs = {"1", "2", "3"};
        int index = Arrays.binarySearch(strs, "1");
        assertThat(index).isEqualTo(0);
    }
}
