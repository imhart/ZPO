package Strategy.CarSpeed;


public class Main {
    public static void main(String[] args) {
        // Zad3
        Pasat pasat = new Pasat();

        CarSpeed carSpeed = new CarSpeed();

        carSpeed.setCar(pasat);

        carSpeed.showCarName();
        System.out.println(carSpeed.getMaxSpeed());

        carSpeed.setCar(new Toyota());

        carSpeed.showCarName();
        System.out.println(carSpeed.getMaxSpeed());

        carSpeed.setCar(new Bugatti());

        carSpeed.showCarName();
        System.out.println(carSpeed.getMaxSpeed());

    }
}
