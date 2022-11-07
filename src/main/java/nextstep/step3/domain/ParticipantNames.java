package nextstep.step3.domain;

import java.util.List;

public class ParticipantNames {
    private final List<ParticipantName> participantNames;

    public ParticipantNames(final List<ParticipantName> participantNames) {
        validateParticipants(participantNames);
        this.participantNames = participantNames;
    }

    private void validateParticipants(final List<ParticipantName> participantNames) {
        if (participantNames.isEmpty()) {
            throw new IllegalArgumentException("참여자 수는 0명일 수 없습니다.");
        }
    }

    public List<ParticipantName> getParticipantNames() {
        return participantNames;
    }

    public int count() {
        return participantNames.size();
    }
}
