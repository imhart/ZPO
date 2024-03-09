public class ModelDuck extends Duck {
    public ModelDuck() {
    }

    public ModelDuck(){
        super RubberDuck();
    }
    public ModelDuck(FlyingBehavior flyingBehavior, QuackBehavior quackBehavior) {
        super(flyingBehavior, quackBehavior);
    }
}
