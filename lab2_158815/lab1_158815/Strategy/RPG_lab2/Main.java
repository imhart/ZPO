package Strategy.RPG_lab2;

public class Main {
    public static void main(String[] args) {
        Character archer = new Character();
        archer.setAttackStrategy(new Bow());
        archer.attack();

        Character knight = new Character();
        knight.setAttackStrategy(new Sword());
        knight.attack();

        Character gunner = new Character();
        gunner.setAttackStrategy(new Gun());
        gunner.attack();

        Character sniper = new Character();
        sniper.setAttackStrategy(new Cannon());
        sniper.attack();
    }
}
