package poly;

public class Circle extends Point implements Comparable {

    private int radius;

    public Circle() {
        this(new Point(), 0);
    }

    public Circle(Point point, int radius) {
        super(point);
        setRadius(radius);
    }

    public Circle(Circle circle) {
        this(circle.getCenter(), circle.getRadius());
    }

    public void setRadius(int radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            this.radius = 0;
        }
    }

    public int getRadius() {
        return radius;
    }

    public Point getCenter() {
        return new Point(getX(), getY());
    }

    @Override
    public String toString() {
        return String.format("Circle: Center %s, Radius = %d",
                super.toString(), radius);
    }

    @Override
    public boolean greater(Comparable obj) {
        if (obj instanceof Circle) {
            Circle circle = new Circle((Circle) obj);
            if (getCenter().greater(circle.getCenter())) {
                return true;
            } else {
                if (getCenter().equals(circle.getCenter())) {
                    if (radius > circle.radius) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (circle.getCenter().greater(getCenter())) {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean equals(Circle circle) {
        if (super.equals(circle.getCenter()) && radius == circle.radius) {
            return true;
        }
        return false;
    }

}
