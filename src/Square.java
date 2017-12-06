public class Square extends Parallelogram {
    public Square(double x, double y, double base) {
        super(x, y, base, base, Math.pow(0.5, (Math.pow(2, base)+Math.pow(2, base))));
    }
    public String toString(){
        return String.format("Square x=%f y=%f side=%f", x,y,base,height);
    }
}
