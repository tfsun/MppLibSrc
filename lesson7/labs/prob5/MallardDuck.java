package labs.Lab7.prob5;

/**
 * Created by rajkumar on 7/6/2015.
 */
public class MallardDuck extends Duck{
    public void display(){
        System.out.println("Mallard Duck");
    }
    public void swim(){
        System.out.println("Can swim");
    }
    public void fly(){
        this.flyWithWings();
    }
    public void quack(){
        realQuack();
    }
    /*public MallardDuck(){
        canNotFly();
        sneakQuack();
    }*/
/*    public void fly(){
        System.out.println("Can not fly");
    }*/
}
