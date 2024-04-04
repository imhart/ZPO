package Strategy.RPG_lab2;

public class Bow implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Broń łuku!");
    }
}

