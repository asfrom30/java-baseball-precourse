package integrations;

import baseball.mvc.domain.Game;
import baseball.mvc.domain.Score;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;


public class GameTest {

    @Test
    @DisplayName("정답이 135이고, 135로 추론")
    public void inferCase1_1() {
        Game game = new Game("135");
        Score score = game.infer("135");
        assertThat(score.toArray()).containsExactly(Score.Value.STRIKE, Score.Value.STRIKE, Score.Value.STRIKE);
    }

    @Test
    @DisplayName("정답이 135이고, 136으로 추론")
    public void inferCase1_2() {
        Game game = new Game("135");
        Score score = game.infer("136");
        assertThat(score.toArray()).containsExactly(Score.Value.STRIKE, Score.Value.STRIKE, Score.Value.NOTHING);
    }

    @Test
    @DisplayName("정답이 135이고, 351로 추론")
    public void inferCase1_3() {
        Game game = new Game("135");
        Score score = game.infer("351");
        assertThat(score.toArray()).containsExactly(Score.Value.BALL, Score.Value.BALL, Score.Value.BALL);
    }

    @Test
    @DisplayName("정답이 742이고, 777로 추론")
    public void inferCase2_1() {
        Game game = new Game("742");
        Score score = game.infer("777");
        assertThat(score.toString()).isEqualTo("[STRIKE, BALL, BALL]");
    }

    @Test
    @DisplayName("정답이 742이고, 742로 추론")
    public void inferCase2_2() {
        Game game = new Game("742");
        Score score = game.infer("742");
        assertThat(score.toString()).isEqualTo("[STRIKE, STRIKE, STRIKE]");
    }

    @Test
    @DisplayName("정답이 925이고, 777로 추론")
    public void inferCase3_1() {
        Game game = new Game("925");
        Score score = game.infer("777");
        assertThat(score.toString()).isEqualTo("[NOTHING, NOTHING, NOTHING]");
    }

    @Test
    @DisplayName("정답이 925이고, 529로 추론")
    public void inferCase3_2() {
        Game game = new Game("925");
        Score score = game.infer("529");
        assertThat(score.toString()).isEqualTo("[BALL, STRIKE, BALL]");
    }
}
