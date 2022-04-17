package baseball.mvc.domain;

import baseball.utils.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;


public class Score {


    public enum Value {
        STRIKE, BALL, NOTHING
    }

    private final ArrayList<Value> values;

    public Score() {
        this.values = new ArrayList<>();
    }



    public void add(Value scoreValue) {
        this.values.add(scoreValue);
    }

    public int countBall() {
        return ArrayUtil.count(this.getValues(), (item) -> item == Score.Value.BALL);
    }

    public int countStrike() {
        return ArrayUtil.count(this.getValues(), (item) -> item == Value.STRIKE);
    }

    public boolean isPerfect() {
        return ArrayUtil.every(this.getValues(), (item) -> item == Value.STRIKE);
    }

    public boolean isPerfectNothing() {
        return ArrayUtil.every(this.getValues(), (item) -> item == Value.NOTHING);
    }

    public Value[] getValues() {
        // TODO: util: ArrayList to Array
        Value[] values = new Value[this.values.size()];
        for (int i = 0; i < this.values.size(); i++) {
            values[i] = this.values.get(i);
        }
        return values;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.getValues());
    }
}

