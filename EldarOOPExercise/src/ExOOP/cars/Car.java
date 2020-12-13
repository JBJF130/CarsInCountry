package ExOOP.cars;

public abstract class Car {

    private int number;
    private int speed;
    private static int counter = 0;
    private static final int MAX_SPEED = 110;
    private static final int MIN_SPEED = 0;


    public Car() {
    }

    public Car(int speed) {
        this.number = counter++;
       setSpeed(speed);
    }

    public int getNumber() {
        return number;
    }

    public int getSpeed() {
        return speed;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSpeed(int speed) {
        if(speed >= MIN_SPEED && speed <= MAX_SPEED) {
            this.speed = speed;
        }
    }
}
