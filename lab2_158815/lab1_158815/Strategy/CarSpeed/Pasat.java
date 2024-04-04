package Strategy.CarSpeed;

public class Pasat implements Car {
    @Override
    public int getMaxSpeed() {
        return 120;
    }

    @Override
    public String getCarName() {
        return "Pasat";
    }
}
