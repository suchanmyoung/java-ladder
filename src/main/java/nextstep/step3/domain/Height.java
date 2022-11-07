package nextstep.step3.domain;

public class Height {
    private static final int MINIMUM_HEIGHT = 1;

    private final int height;

    public Height(int height) {
        validateHeight(height);
        this.height = height;
    }

    private void validateHeight(int height) {
        if (height < MINIMUM_HEIGHT) {
            throw new IllegalArgumentException("사다리 높이는 1 이상이어야 합니다.");
        }
    }

    public int value(){
        return this.height;
    }
}
