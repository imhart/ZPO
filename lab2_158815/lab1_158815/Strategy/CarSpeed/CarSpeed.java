package Strategy.CarSpeed;

public class CarSpeed {

    Car car;

    public void setCar(Car s){
        car = s;
    }

    public int getMaxSpeed(){
        return car.getMaxSpeed();
    }

    public void showCarName()
    {
        System.out.println(car.getCarName());
    }
}
