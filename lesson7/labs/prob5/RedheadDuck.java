package labs.Lab7.prob5;

/**
 * Created by rajkumar on 7/6/2015.
 */
public class RedheadDuck extends Duck {
    public void fly(){
        flyWithWings();
    }
    public void quack(){
        realQuack();
    }
    public void swim(){
        System.out.println("Can swim");
    }

    public void display(){
        System.out.println("Red head Duck");
    }
}
