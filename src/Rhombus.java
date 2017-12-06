public class Rhombus extends Parallelogram{
    public Rhombus(double x, double y, double base, double height) {
        super(x, y, base, height, Math.pow(0.5, (Math.pow(2, base/2)+Math.pow(2, height/2))));
    }
    public String toString(){
        return String.format("Rhombus x=%f y=%f base=%f height=%f", x,y,base,height);
    }
}
