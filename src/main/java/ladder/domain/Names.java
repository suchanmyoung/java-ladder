package ladder.domain;

import ladder.util.Assert;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Names {

    private static final String NAMES_DELIMITER = ",";
    private static final String NULL_MESSAGE = "입력이 null일 수 없습니다.";

    private final List<Name> names;

    public Names(String names) {
        Assert.notNull(names, NULL_MESSAGE);

        this.names = Arrays.stream(names.split(NAMES_DELIMITER))
                .map(Name::new)
                .collect(Collectors.toList());
    }

    public int count() {
        return names.size();
    }

    public List<Name> getNames() {
        return Collections.unmodifiableList(names);
    }

}
