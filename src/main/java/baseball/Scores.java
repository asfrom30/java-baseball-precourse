package baseball;

import java.util.ArrayList;

public class Scores {
    private final ArrayList<String> values;

    public Scores() {
        this.values = new ArrayList<>();
    }

    // TODO: 테스트 통과후 삭제할것
    public String[] getValues() {
        return this.values.toArray(new String[this.values.size()]);
    }

    public void add(String score) {
        // 3개 이상이면 제한
        this.values.add(score);
    }
}
