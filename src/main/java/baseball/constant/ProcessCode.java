package baseball.constant;

public enum ProcessCode {
    CONTINUE("1"), EXIT("2");

    public static boolean isValid(String code) {
        // TODO: ArrayUtil.some()
        ProcessCode[] all = new ProcessCode[]{ProcessCode.CONTINUE, ProcessCode.EXIT};
        for (int i = 0; i < all.length; i++) {
            if(all[i].equals(code)) return true;
        }
        return false;
    }

    private final String value;

    private ProcessCode(String str) {
        this.value = str;
    }

    public boolean equals(String str) {
        return this.value.equals(str);
    }

};