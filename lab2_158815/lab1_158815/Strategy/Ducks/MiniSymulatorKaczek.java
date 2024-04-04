package Strategy.Ducks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniSymulatorKaczek {
    public static void main(String[] args) {


        List<Duck> ducksAL = new ArrayList<>(Arrays.asList(
                new DecoyDuck(),
                new MallardDuck(),
                new RedHeadDuck(),
                new RubberDuck(),
                new DecoyDuck(),
                new MallardDuck(),
                new RubberDuck()
                ));

        for (Duck duck : ducksAL){
            duck.performFly();
            duck.performQuack();
        }
    }
}
