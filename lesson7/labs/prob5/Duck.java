package labs.Lab7.prob5;

/**
 * Created by rajkumar on 7/6/2015.
 */
public abstract class Duck implements Flyable,Quackable {
/*    public void fly(){

    }
    public void quack(){

    }*/
    public abstract void quack();
    public abstract void fly();
    public abstract void swim();
    public abstract void display();
/*
    private Flyable flyable;
    private Quackable quackable;

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public Quackable getQuackable() {
        return quackable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }*/
}
