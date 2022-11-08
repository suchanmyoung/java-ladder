package nextstep.step3.domain;

public class Point {

    private final boolean left;
    private final boolean current;

    public Point(boolean left, boolean current) {
        if (left && current) {
            throw new IllegalArgumentException();
        }

        this.left = left;
        this.current = current;
    }

    public static Point first(boolean current) {
        return new Point(false, current);
    }

    public Direction move() {
        if (current) {
            return Direction.RIGHT;
        }
        if (left) {
            return Direction.LEFT;
        }
        return Direction.SOUTH;
    }

    public Point next(boolean current) {
        return new Point(this.current, current);
    }

    public Point last() {
        return new Point(this.current, false);
    }
}
