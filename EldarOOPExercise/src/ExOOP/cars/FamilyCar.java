package ExOOP.cars;

public class FamilyCar extends Car {


    public FamilyCar(int speed) {
        super(speed);
    }

    @Override
    public String toString() {
        return "FamilyCar{ number=" + getNumber() + " speed = " + getSpeed() + "}";
    }
}
