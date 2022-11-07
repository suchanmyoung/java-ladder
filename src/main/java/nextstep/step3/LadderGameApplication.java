package nextstep.step3;

import nextstep.step3.domain.Height;
import nextstep.step3.domain.Ladder;
import nextstep.step3.domain.ParticipantNames;
import nextstep.step3.view.InputView;
import nextstep.step3.view.OutputView;

public class LadderGameApplication {

    public static void main(String[] args) {
        final String[] inputParticipantNames = InputView.inputParticipantNames();
        String[] inputGameResult = InputView.inputGameResult();
        final ParticipantNames participantNames = ParticipantNames.createParticipantNamesByStrings(inputParticipantNames);
        final Height ladderHeight = new Height(InputView.inputLadderHeight());
        InputView.inputParticipantResult();
        final Ladder ladder = new Ladder(participantNames, ladderHeight);
        OutputView.printGameResult(ladder);
    }
}
