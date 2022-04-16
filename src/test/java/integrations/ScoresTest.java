package integrations;

import baseball.Scores;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoresTest {

    @Test
    public void test() {
        Scores scores = new Scores();
        scores.add("S");
        scores.add("S");
        scores.add("S");
        assertThat(scores.getValues()).containsExactly("S", "S", "S");
    }

    @Test
    @DisplayName("스코어의 개수는 최대 3개까지 허용한다.")
    public void test2(){

    }
}
