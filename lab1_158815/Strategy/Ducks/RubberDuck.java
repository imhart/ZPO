package Strategy.Ducks;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyRocketPowered();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
