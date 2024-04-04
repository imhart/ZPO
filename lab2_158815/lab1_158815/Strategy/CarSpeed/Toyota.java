package Strategy.CarSpeed;

public class Toyota implements Car {
    @Override
    public int getMaxSpeed() {
        return 150;
    }

    @Override
    public String getCarName() {
        return "Toyota";
    }
}
