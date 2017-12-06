public class Parallelogram extends Geometric {
    protected double base, height, diagonal;
    public Parallelogram(double x, double y, double base, double height, double diagonal) {
        super(x,y);
        this.base = base;
        this.height = height;
        this.diagonal = diagonal;
    }
    @Override
    public double getArea() {
        double S = (base + height + diagonal)/2;
        double triangleArea = Math.pow(0.5, (S*(S-base)*(S-height)*(S-diagonal)));
        return 2*triangleArea;
    }
    public String toString(){
        return String.format("Parallelogram x=%f y=%f base=%f height=%f diagonal=%f", x,y,base,height,diagonal);
    }
}