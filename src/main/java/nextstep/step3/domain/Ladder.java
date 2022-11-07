package nextstep.step3.domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ladder {
    private final ParticipantNames participantNames;
    private final List<Line> lines;

    public Ladder(final ParticipantNames participantNames, final Height height) {
        this.participantNames = participantNames;
        lines = IntStream.range(0, height.value())
                .mapToObj(i -> new Line(participantCount()))
                .collect(Collectors.toList());
    }

    public ParticipantNames getParticipantNames() {
        return participantNames;
    }

    public List<Line> getLines() {
        return lines;
    }

    private int participantCount() {
        return participantNames.count();
    }
}
