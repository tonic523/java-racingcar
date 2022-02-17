package racingcar.model.car;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class PositionTest {
    @Nested
    @DisplayName("increase 메소드는")
    class Increase {
        @Test
        @DisplayName("현재 위치에 1을 더한 Position을 리턴한다.")
        void it_returns_position_of_one_plus_value() {
            Position position = new Position();
            assertThat(position.increase()).isEqualTo(new Position(1));
        }
    }
}
