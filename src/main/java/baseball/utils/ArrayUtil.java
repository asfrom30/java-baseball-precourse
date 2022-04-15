package baseball.utils;

import java.util.Arrays;

public class ArrayUtil {

    public static boolean every(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] != target) return false;
        }
        return true;
    }

    public static int count(String[] array, String target) {
        return (int) Arrays.stream(array).filter(str -> str == target).count();
    }
}
