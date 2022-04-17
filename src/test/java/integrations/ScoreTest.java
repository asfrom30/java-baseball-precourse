package integrations;

import baseball.mvc.domain.Score;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoreTest {

    @Test
    @DisplayName("isPerfect() : SSS true")
    public void test1() {
        Score score = new Score();
        score.add(Score.Value.STRIKE);
        score.add(Score.Value.STRIKE);
        score.add(Score.Value.STRIKE);
        assertThat(score.isPerfect()).isEqualTo(true);
    }

    @Test
    @DisplayName("isPerfect() : SSB false")
    public void test2() {
        Score score = new Score();
        score.add(Score.Value.STRIKE);
        score.add(Score.Value.STRIKE);
        score.add(Score.Value.BALL);
        assertThat(score.isPerfect()).isEqualTo(false);
    }

    @Test
    @DisplayName("countBall() : BBS 2")
    public void test3() {
        Score score = new Score();
        score.add(Score.Value.BALL);
        score.add(Score.Value.BALL);
        score.add(Score.Value.STRIKE);
        assertThat(score.countBall()).isEqualTo(2);
    }

    @Test
    @DisplayName("getValues()")
    public void test4() {
        Score score = new Score();
        score.add(Score.Value.STRIKE);
        score.add(Score.Value.STRIKE);
        score.add(Score.Value.STRIKE);
        assertThat(score.toArray()).containsExactly(Score.Value.STRIKE, Score.Value.STRIKE, Score.Value.STRIKE);
    }


    @Test
    @DisplayName("예외케이스 : 스코어의 개수는 최대 3개까지 허용한다.")
    public void test5(){
        // TODO
    }
}
