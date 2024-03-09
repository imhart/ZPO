import java.util.ArrayList;

public class MainDuckSim extends Duck{
    public MainDuckSim() {

    }



    public MainDuckSim(FlyingBehavior flyingBehavior, QuackBehavior quackBehavior) {
        super(flyingBehavior, quackBehavior);
    }

    public static void main(String[] args) {
        Duck duck1 = new MallarDuck(new  FlayingWithWings(), new Squeak());
        duck1.preformFly();
        duck1.preformQuack();

        ArrayList<Duck> kaczki = new ArrayList<>();
        kaczki.add(new MallarDuck(new FlayingNoWay()));
        for ()


         kaczki.get(1).setFlyingBehavior(new FlyingBehavior() {
             @Override
             public void fly() {
                 System.out.println("Duck is flaying with a jetpack");
             }
         })
    }
}
