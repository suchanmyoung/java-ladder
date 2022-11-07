package nextstep.step3.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParticipantNames {
    private final List<ParticipantName> participantNames;

    public ParticipantNames(final List<ParticipantName> participantNames) {
        validateParticipants(participantNames);
        this.participantNames = participantNames;
    }

    public static ParticipantNames createParticipantNamesByStrings(String[] participantNames) {
        return new ParticipantNames(Arrays.stream(participantNames)
            .map(name -> new ParticipantName(name))
            .collect(Collectors.toList()));
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
