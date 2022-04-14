package baseball.constant;

public enum ProcessCode {
    CONTINUE("1"), EXIT("2");

    private final String value;

    private ProcessCode(String str) {
        this.value = str;
    }

    public boolean equals(String str) {
        return this.value.equals(str);
    }
};