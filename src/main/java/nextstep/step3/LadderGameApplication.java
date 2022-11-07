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
        final ParticipantNames participantNames = new ParticipantNames(toParticipantNames(inputParticipantNames));
        final Height ladderHeight = new Height(InputView.inputLadderHeight());
        final Ladder ladder = new Ladder(participantNames, ladderHeight);
        OutputView.printGameResult(ladder);
    }

    private static List<ParticipantName> toParticipantNames(String[] inputParticipantNames) {
        return Arrays.stream(inputParticipantNames)
                .map(name -> new ParticipantName(name))
                .collect(Collectors.toList());
    }
}
