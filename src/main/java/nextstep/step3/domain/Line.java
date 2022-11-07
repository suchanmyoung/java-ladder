package nextstep.step3.domain;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private final List<Link> links = new ArrayList<>();

    public Line(final int countOfParticipant) {
        RandomLineGenerator randomLineGenerator = new RandomLineGenerator(countOfParticipant);
        for (int position = 1; position <= countOfParticipant; position++) {
            links.add(new Link(randomLineGenerator.createRandomBoolean(position)));
        }
    }

    public List<Link> getLinks() {
        return links;
    }
}
