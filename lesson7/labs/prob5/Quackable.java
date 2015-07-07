package labs.Lab7.prob5;

/**
 * Created by rajkumar on 7/6/2015.
 */
public interface Quackable {
    default void sneakQuack(){
        System.out.println("Sneak quack.");
    }
    default void realQuack(){
        System.out.println("Quack");
    }
    default void muteQuack(){
        System.out.println("Mute Quack");
    }
}
