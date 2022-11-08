package nextstep.step3.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CrossTest {

    @Test
    void right() {
        Point right = Point.first(true);
        Cross cross = new Cross(1, right);
        assertThat(cross.move()).isEqualTo(2);
    }

    @Test
    void left() {
        Point left = Point.first(true).next(false);
        Cross cross = new Cross(1, left);
        assertThat(cross.move()).isEqualTo(0);
    }

    @Test
    void south() {
        Point south = Point.first(false);
        Cross cross = new Cross(1, south);
        assertThat(cross.move()).isEqualTo(1);
    }
}
