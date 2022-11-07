package nextstep.step3.domain;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ParticipantNamesTest {

    @DisplayName("참여자 수가 0명이면 예외 처리")
    @Test
    void participant_count_not_zero() {
        List<ParticipantName> blankList = new ArrayList<>();
        Assertions.assertThatThrownBy(() -> new ParticipantNames(blankList))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
