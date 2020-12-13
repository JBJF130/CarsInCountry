package ExOOP.cars;

public class SportCar extends Car{

    public SportCar(int speed) {
        super(speed);
    }

    @Override
    public String toString() {
        return "SportCar{ number=" + getNumber() + " speed = " + getSpeed() + "}";
    }
}
