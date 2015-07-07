package labs.Lab7.prob2;

/**
 * Created by rajkumar on 7/6/2015.
 */
public class Ellipse implements ClosedCurve {
    private double semiMajorAxis;
    private double eccentricity;

    public Ellipse(double semiMajorAxis,double eccentricity){
        this.semiMajorAxis=semiMajorAxis;
        this.eccentricity=eccentricity;
    }
    @Override
    public double computePerimeter(){
        return 4 * semiMajorAxis * eccentricity;
    }
}
