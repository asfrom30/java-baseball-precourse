package integrations;

import baseball.Game;
import baseball.Scores;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class GameTest {

    @Test
    @DisplayName("정답이 135이고, 135로 추론")
    public void newInferA() {
        Game game = new Game("135");
        Scores scores = game.infer("135");
        assertThat(scores.getValues()).containsExactly("S", "S", "S");
    }

    @Test
    @DisplayName("정답이 135이고, 136으로 추론")
    public void newInferB() {
        Game game = new Game("135");
        Scores scores = game.infer("136");
        assertThat(scores.getValues()).containsExactly("S", "S", "F");
    }

    @Test
    @DisplayName("정답이 135이고, 351로 추론")
    public void newInferC() {
        Game game = new Game("135");
        Scores scores = game.infer("351");
        assertThat(scores.getValues()).containsExactly("B", "B", "B");
    }

}
