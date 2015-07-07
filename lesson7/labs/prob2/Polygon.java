package labs.Lab7.prob2;

/**
 * Created by rajkumar on 7/6/2015.
 */
public interface Polygon extends ClosedCurve {
    default double computePerimeter(){
        double[] sides=this.getSides();
        double perimeter=0.0;

        for (double side:sides){
            perimeter+=side;
        }
        System.out.println("Polygon is "+this.getClass().getSimpleName()+" and perimeter is "+perimeter);
        return perimeter;
    }
    double[] getSides();
}
