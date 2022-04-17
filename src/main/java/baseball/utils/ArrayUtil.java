package baseball.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtil {

    @FunctionalInterface
    public interface Equality<T> {
        public abstract boolean test(T object);
    }

    public static <E> boolean every(E[] array, Equality<E> equality) {
        for (int i = 0; i < array.length; i++) {
            if(!equality.test((E) array[i])) return false;
        }
        return true;
    }

    public static <E> boolean some(E[] array, Equality<E> equality) {
        for (int i = 0; i < array.length; i++) {
            if(equality.test((E) array[i])) return true;
        }
        return false;
    }

    public static <E> int count(E[] array, Equality<E> equality) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if(equality.test((E) array[i])) list.add(array[i]);
        }
        return list.size();
    }
}
