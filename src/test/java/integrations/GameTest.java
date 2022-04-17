package integrations;

import baseball.domain.Game;
import baseball.domain.Score;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class GameTest {

    @Test
    @DisplayName("정답이 135이고, 135로 추론")
    public void newInferA() {
        Game game = new Game("135");
        Score score = game.infer("135");
        assertThat(score.getValues()).containsExactly(Score.Value.STRIKE, Score.Value.STRIKE, Score.Value.STRIKE);
    }

    @Test
    @DisplayName("정답이 135이고, 136으로 추론")
    public void newInferB() {
        Game game = new Game("135");
        Score score = game.infer("136");
        assertThat(score.getValues()).containsExactly(Score.Value.STRIKE, Score.Value.STRIKE, Score.Value.NOTHING);
    }

    @Test
    @DisplayName("정답이 135이고, 351로 추론")
    public void newInferC() {
        Game game = new Game("135");
        Score score = game.infer("351");
        assertThat(score.getValues()).containsExactly(Score.Value.BALL, Score.Value.BALL, Score.Value.BALL);
    }

}
