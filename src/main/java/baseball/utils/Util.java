package baseball.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class Util {

    public static String makeRandom(int howManyDigit) {
        String string = "";
        for (int i = 0; i < howManyDigit; i++) {
            Integer random = Randoms.pickNumberInRange(1,9);
            string += random;
        }
        return string;
    }

}
