package Strategy.Ducks;

public class DecoyDuck extends Duck {

	public int getPriorityValueInSort() {
		return priorityValueInSort;
	}

	public void setPriorityValueInSort(int priorityValueInSort) {
		this.priorityValueInSort = priorityValueInSort;
	}

	int priorityValueInSort = 10;

	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
