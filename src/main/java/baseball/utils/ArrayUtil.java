package baseball.utils;

import java.util.ArrayList;
import java.util.Arrays;



public class ArrayUtil {

    @FunctionalInterface
    public interface Equality {
        public abstract boolean test(Object object);
    }


    public static boolean every(Object[] array, Equality equality) {
        for (int i = 0; i < array.length; i++) {
            if(!equality.test(array[i])) return false;
        }
        return true;
    }

    public static boolean every(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != target) return false;
        }
        return true;
    }

    public static int count(String[] array, String target) {
        return (int) Arrays.stream(array).filter(str -> str == target).count();
    }

    public static int count(Object[] array, Equality equality) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if(equality.test(array[i])) list.add(array[i]);
        }
        return list.size();
    }



}
