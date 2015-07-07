package labs.Lab7.prob5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajkumar on 7/6/2015.
 */
public class Application {
    public static void main(String[] args) {
        List<Duck> ducks=new ArrayList<>();
        ducks.add(new DecoyDuck());
        ducks.add(new MallardDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new RubberDuck());

        for (Duck duck:ducks){
            duck.display();
            duck.swim();
            duck.fly();
            duck.quack();
            System.out.println("----------");
        }
    }
}
