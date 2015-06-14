package poly;

public class Cylinder extends Circle implements Comparable {

    private int height;

    public Cylinder() {
        this(new Circle(), 0);
    }

    public Cylinder(Circle circle, int height) {
        super(circle);
        setHeight(height);
    }

    public Cylinder(Cylinder cylinder) {
        this(cylinder.getBase(), cylinder.height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height >= 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public Circle getBase() {
        return new Circle(getCenter(), getRadius());
    }

    @Override
    public String toString() {
        return String.format("Cylinder: %s, Height = %d", super.toString(), height);
    }

    @Override
    public boolean greater(Comparable obj) {
        if (obj instanceof Cylinder) {
            Cylinder cylinder = new Cylinder((Cylinder) obj);
            if (getBase().greater(cylinder.getBase())) {
                return true;
            } else {
                if (getBase().equals(cylinder.getBase())) {
                    if (height > cylinder.height) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (cylinder.getBase().greater(getBase())) {
                    return false;
                }
            }
        }
        return false;
    }

}
