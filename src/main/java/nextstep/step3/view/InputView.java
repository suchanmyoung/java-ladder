package nextstep.step3.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String DEFAULT_DELIMITER = ",";

    public static String[] inputParticipantNames() {
        OutputView.printParticipantNamesNotification();

        return scanner.nextLine().split(DEFAULT_DELIMITER);
    }

    public static String[] inputGameResult() {
        OutputView.printResultNotification();

        return scanner.nextLine().split(DEFAULT_DELIMITER);
    }

    public static int inputLadderHeight() {
        OutputView.printLadderHeightNotification();

        return scanner.nextInt();
    }

    public static String inputParticipantResult() {
        OutputView.printParticipantResultName();

        return scanner.next();
    }
}
