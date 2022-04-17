package baseball.utils;

import java.util.ArrayList;
import java.util.Arrays;



public class ArrayUtil {

    // T형으로 모두 변경해야 됨
    @FunctionalInterface
    public interface Equality<T> {
        public abstract boolean test(T object);
    }

    public static boolean every(Object[] array, Equality equality) {
        for (int i = 0; i < array.length; i++) {
            if(!equality.test(array[i])) return false;
        }
        return true;
    }

    public static <E> boolean some(E[] array, Equality<E> equality) {
        for (int i = 0; i < array.length; i++) {
            if(equality.test((E) array[i])) return true;
        }
        return false;
    }

    public static int count(Object[] array, Equality equality) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if(equality.test(array[i])) list.add(array[i]);
        }
        return list.size();
    }
}
