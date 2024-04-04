package Strategy.RPG_lab2;

public class Cannon implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("broń bazuka!");
    }
}
