package nextstep.step3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import nextstep.step3.domain.Height;
import nextstep.step3.domain.Ladder;
import nextstep.step3.domain.ParticipantName;
import nextstep.step3.domain.ParticipantNames;
import nextstep.step3.view.InputView;
import nextstep.step3.view.OutputView;

public class LadderGameApplication {

    public static void main(String[] args) {
        final String[] inputParticipantNames = InputView.inputParticipantNames();
        final ParticipantNames participantNames = ParticipantNames.from(toParticipantNames(inputParticipantNames));
        final Height ladderHeight = Height.from(InputView.inputLadderHeight());
        final Ladder ladder = Ladder.of(participantNames, ladderHeight);
        OutputView.printGameResult(ladder);
    }

    private static List<ParticipantName> toParticipantNames(String[] inputParticipantNames) {
        return Arrays.stream(inputParticipantNames)
                .map(name -> ParticipantName.from(name))
                .collect(Collectors.toList());
    }
}
