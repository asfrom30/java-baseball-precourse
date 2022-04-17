package baseball.utils;

public class NumberUtil {
    public static boolean isNumeric(String strNum) {
        try {
            if (strNum == null)  return false;
            Double.parseDouble(strNum);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
