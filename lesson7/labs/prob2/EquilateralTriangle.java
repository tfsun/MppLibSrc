package labs.Lab7.prob2;

/**
 * Created by rajkumar on 7/6/2015.
 */
public class EquilateralTriangle implements Polygon {
    private double side;
    public EquilateralTriangle(double side){
        this.side=side;
    }

    public double[] getSides(){
        return new double[]{side,side,side};
    }
}
