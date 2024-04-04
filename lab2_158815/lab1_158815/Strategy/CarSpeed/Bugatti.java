package Strategy.CarSpeed;

public class Bugatti implements Car {
    @Override
    public int getMaxSpeed() {
        return 250;
    }

    @Override
    public String getCarName() {
        return "Bugatti";
    }
}