package baseball.utils;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class RandomUtil {

    public static ArrayList<Integer> pickNumbersWithoutDuplicate(int howManyDigit) {
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < howManyDigit; i++) {
            int random = pickOne(numberList);
            numberList.add(random);
        }
        return numberList;
    }

    public static Integer pickOne(ArrayList<Integer> excludeList) {
        while (true) {
            Integer candidate = Randoms.pickNumberInRange(0,9);
            if(!excludeList.contains(candidate)) return candidate;
        }
    }
}
