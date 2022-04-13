package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class GameTest {

    @Test
    @DisplayName("정답이 135인 경우")
    public void infer() {
        Game game = new Game("135");
        String result = game.infer("135");
        assertThat(result).isEqualTo("3스트라이크");
    }
    
}
