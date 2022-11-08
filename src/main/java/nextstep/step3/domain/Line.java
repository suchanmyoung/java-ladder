package nextstep.step3.domain;

import java.util.List;

public class Line {

    private List<Cross> crosses;

    public int move(int position) {
        return crosses.get(position).move();
    }
}
