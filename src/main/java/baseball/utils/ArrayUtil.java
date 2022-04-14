package baseball.utils;

import java.util.Arrays;

public class ArrayUtil {

    public static boolean every(String[] array, String target) {
        return Arrays.stream(array).allMatch(str -> str == target);
    }

    public static int count(String[] array, String target) {
        return (int) Arrays.stream(array).filter(str -> str == target).count();
    }
}
