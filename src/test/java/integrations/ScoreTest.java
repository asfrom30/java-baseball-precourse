package integrations;

import baseball.domain.Score;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoreTest {

    @Test
    public void test() {
        Score score = new Score();
        score.add(Score.Value.STRIKE);
        score.add(Score.Value.STRIKE);
        score.add(Score.Value.STRIKE);
        assertThat(score.getValues()).containsExactly(Score.Value.STRIKE, Score.Value.STRIKE, Score.Value.STRIKE);

    }

    @Test
    @DisplayName("스코어의 개수는 최대 3개까지 허용한다.")
    public void test2(){


    }

    @Test
    @DisplayName("isPerfect : SSS true")
    public void test3() {
        Score score = new Score();
        score.add(Score.Value.STRIKE);
        score.add(Score.Value.STRIKE);
        score.add(Score.Value.STRIKE);
        assertThat(score.isPerfect()).isEqualTo(true);
    }

    @Test
    @DisplayName("isPerfect : SSB false")
    public void test4() {
        Score score = new Score();
        score.add(Score.Value.STRIKE);
        score.add(Score.Value.STRIKE);
        score.add(Score.Value.BALL);
        assertThat(score.isPerfect()).isEqualTo(false);
    }

    @Test
    public void test5() {
        Score score = new Score();
        score.add(Score.Value.STRIKE);
        score.add(Score.Value.STRIKE);
        score.add(Score.Value.STRIKE);
    }


}
