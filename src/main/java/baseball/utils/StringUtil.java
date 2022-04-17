package baseball.utils;

import java.util.ArrayList;

public class StringUtil {

    static public String from(ArrayList<Integer> list) {
        String string = "";
        for (Integer s: list) {
            string += s;
        }
        return string;
    }
}
