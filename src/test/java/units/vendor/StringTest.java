package units.vendor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

public class StringTest {

    @Test
    public void split() {
        String str = "123";
        String[] strs = str.split("");
        assertThat(strs).containsExactly("1", "2", "3");
    }

}
