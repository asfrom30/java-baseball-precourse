package integrations;

import baseball.Game;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class GameTest {

    @Test
    @DisplayName("정답이 135이고, 135로 추론")
    public void newInferA() {
        Game game = new Game("135");
        String[] result = game.infer("135");
        assertThat(result).containsExactly("S", "S", "S");
    }

    @Test
    @DisplayName("정답이 135이고, 136으로 추론")
    public void newInferB() {
        Game game = new Game("135");
        String[] result = game.infer("136");
        assertThat(result).containsExactly("S", "S", "F");
    }

    @Test
    @DisplayName("정답이 135이고, 351로 추론")
    public void newInferC() {
        Game game = new Game("135");
        String[] result = game.infer("351");
        assertThat(result).containsExactly("B", "B", "B");
    }

}
