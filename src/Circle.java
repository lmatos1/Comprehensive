

public class Circle extends Elipsoid {

    Circle(double x, double y, double r) { super(x, y, r, r); }

    @Override
    public String toString() {
        return String.format("Circle: x=%f y=%f r=%f", x, y, semiMajor);
    }

}
