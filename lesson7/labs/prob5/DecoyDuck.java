package labs.Lab7.prob5;

/**
 * Created by rajkumar on 7/6/2015.
 */
public class DecoyDuck extends Duck  {
    public void display(){
        System.out.println("Decoy Duck");
    }
    public void swim(){
        System.out.println("Can't swim");
    }
    public void quack(){
        muteQuack();
    }
    public void fly(){
        canNotFly();
    }
}
