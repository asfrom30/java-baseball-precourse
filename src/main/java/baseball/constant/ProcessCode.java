package baseball.constant;

import baseball.utils.ArrayUtil;

public enum ProcessCode {
    CONTINUE("1"), EXIT("2");

    public static boolean isValid(String code) {
        ProcessCode[] all = new ProcessCode[]{ProcessCode.CONTINUE, ProcessCode.EXIT};
        return ArrayUtil.some(all, (item) -> item.equals(code));
    }

    private final String value;

    private ProcessCode(String str) {
        this.value = str;
    }

    public boolean equals(String str) {
        return this.value.equals(str);
    }

};