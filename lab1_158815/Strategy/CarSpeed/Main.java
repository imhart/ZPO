package Strategy.CarSpeed;


public class Main {
    public static void main(String[] args) {
        // Zad3
        Pasat pasat = new Pasat();

        CarSpeed carSpeed = new CarSpeed();

        carSpeed.setStrategy(pasat);

        carSpeed.showCarName();
        System.out.println(carSpeed.getMaxSpeed());

        carSpeed.setStrategy(new Toyota());

        carSpeed.showCarName();
        System.out.println(carSpeed.getMaxSpeed());

        carSpeed.setStrategy(new Bugatti());

        carSpeed.showCarName();
        System.out.println(carSpeed.getMaxSpeed());

    }
}
