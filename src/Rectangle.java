public class Rectangle extends Parallelogram {
    public Rectangle(double x, double y, double base, double height) {
        super(x, y, base, height, Math.pow(0.5, (Math.pow(2, base)+Math.pow(2, height))));
    }
    public String toString(){
        return String.format("Rectangle x=%f y=%f base=%f height=%f", x,y,base,height);
    }
}