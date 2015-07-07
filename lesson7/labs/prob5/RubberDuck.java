package labs.Lab7.prob5;

/**
 * Created by rajkumar on 7/6/2015.
 */
public class RubberDuck extends Duck{
    public void swim(){
        System.out.println("Can't swim");
    }
    public void display(){
        System.out.println("Rubber Duck");
    }
    public void fly(){
        canNotFly();
    }
    public void quack(){
        sneakQuack();
    }

}
