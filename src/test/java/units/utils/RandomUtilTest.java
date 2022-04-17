package units.utils;

import baseball.utils.RandomUtil;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.assertj.core.api.Assertions.*;

public class RandomUtilTest {

    @Test
    public void makeRandomTest() {
        ArrayList list = RandomUtil.pickNumbersWithoutDuplicate(3);
        assertThat(new HashSet<>(list).size()).isEqualTo(3);
    }

    @Test
    public void makeRandomTest2() {
        ArrayList list = RandomUtil.pickNumbersWithoutDuplicate(4);
        assertThat(new HashSet<>(list).size()).isEqualTo(4);
    }

    @Test
    public void makeRandomTest3() {
        ArrayList list = RandomUtil.pickNumbersWithoutDuplicate(10);
        assertThat(list).contains(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    }


    @Test
    public void test3() {
        ArrayList<Integer> exclusiveList = new ArrayList<>();
        exclusiveList.add(0);
        exclusiveList.add(1);
        exclusiveList.add(2);
        exclusiveList.add(3);
        exclusiveList.add(4);
        exclusiveList.add(5);
        exclusiveList.add(6);
        exclusiveList.add(7);
        exclusiveList.add(8);

        int a = RandomUtil.pickOne(exclusiveList);
        assertThat(a).isEqualTo(9);
    }
}
