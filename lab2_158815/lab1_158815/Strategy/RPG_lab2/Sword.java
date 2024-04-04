package Strategy.RPG_lab2;

public class Sword implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Broń mieczem!");
    }
}
