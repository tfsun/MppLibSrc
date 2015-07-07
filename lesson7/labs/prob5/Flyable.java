package labs.Lab7.prob5;

/**
 * Created by rajkumar on 7/6/2015.
 */
public interface Flyable {
    default void flyWithWings(){
        System.out.println("Fly with wings");
    }
    default void canNotFly(){
        System.out.println("Can't fly");
    }
}
