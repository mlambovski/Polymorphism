package poly;

public class Point extends Shape implements Comparable {

    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public Point(Point point) {
        this(point.x, point.y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }

    @Override
    public boolean greater(Comparable obj) {
        if (obj instanceof Point) {
            Point point = new Point((Point) obj);
            if (x > point.x) {
                return true;
            } else if (x == point.x && y > point.y) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Point point) {
        if (x == point.x && y == point.y) {
            return true;
        }
        return false;
    }
}
