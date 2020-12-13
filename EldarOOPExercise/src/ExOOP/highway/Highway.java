package ExOOP.highway;

import ExOOP.cars.Car;
import ExOOP.cars.FamilyCar;
import ExOOP.cars.SportCar;

import java.util.Arrays;

public class Highway {

    private String name;
    private Car[] cars ;


    public Highway(String name) {
        setName(name);
        this.cars = new Car[100];

    }


    public void populateHighway(){

        int carClass = 0;
        int numberOfCars = ((int)(Math.random()*95) + 6);
        for(int i = 0 ; i< numberOfCars; i++){

            int speed = ((int)(Math.random()*111));


            carClass = ((int)(Math.random()*2));

            switch (carClass){

                case 0:
                    this.cars[i] = new SportCar(speed);
                    break;
                case 1:
                    this.cars[i] = new FamilyCar(speed);
                    break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Highway{" +
                "name='" + name + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
