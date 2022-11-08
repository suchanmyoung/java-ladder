package nextstep.step3.domain;

import java.util.List;

public class Ladder {

    private List<Line> lines;

    public int move(int position) {
        int result = position;
        for (Line line : lines) {
            result = line.move(result);
        }
        return result;
    }
}
