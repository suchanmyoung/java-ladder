package nextstep.step3.view;

import nextstep.step3.domain.Ladder;

public class OutputView {

    private static final String LADDER_VIEW = "|";
    private static final String LADDER_LINK = "-";
    private static final String LADDER_SPACE = " ";
    private static final int LADDER_WHITE_SPACE_SIZE = 5;
    private static final int NAME_WHITE_SPACE_SIZE = 6;

    public static void printParticipantNamesNotification() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요.)");
    }

    public static void printResultNotification() {
        System.out.println();
        System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
    }


    public static void printParticipantResultName() {
        System.out.println();
        System.out.println("결과를 보고 싶은 사람은?");
    }

    public static void printLadderHeightNotification() {
        System.out.println();
        System.out.println("최대 사다리 높이는 몇 개인가요?");
    }

    public static void printGameResult(Ladder ladder) {
        System.out.println();
        System.out.println("실행결과");

        printNames(ladder);
        printLadders(ladder);
    }

    private static void printNames(Ladder ladder) {
        System.out.println();
    }

    private static void printLadders(Ladder ladder) {
        System.out.println();
    }
}
