package Strategy.RPG_lab2;

public class Gun implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Broń pistolet!");
    }
}
