package ExOOP;

import ExOOP.cars.Car;
import ExOOP.country.Country;
import ExOOP.highway.Highway;

public class MainProgram {


    public static void main(String[] args) {

        Country israel = new Country();

        israel.populateCountryWithHighways();

        printTotalNumberOfCar(israel);

        printTotalCarsInHighway(israel);

        printAvgSpeedOfCarsInCountry(israel);

        printFastestCar(israel);

        printHighwayWithMoreCars(israel);

        printFastestHighWay(israel);

    }

    private static void printFastestHighWay(Country country) {
        double avgByHighway = 0;
        double fastestAvgByHighway = 0;
        Highway fastestHighway = null;
        for (Highway oneHighway : country.getHighways()) {

            if (oneHighway != null) {

                for (Car oneCar : oneHighway.getCars()) {

                    if (oneCar != null) {
                        avgByHighway += oneCar.getSpeed();

                    } else {
                        break;
                    }
                }

                avgByHighway /= getTotalCarsInHighway(oneHighway);
                if (avgByHighway > fastestAvgByHighway) {
                    fastestAvgByHighway = avgByHighway;
                    fastestHighway = oneHighway;
                }
            } else {
                break;
            }

        }
        System.out.println("The fastest Highway is " + fastestHighway.getName());


    }

    public static void printTotalNumberOfCar(Country country) {
        int count = 0;

        for (Highway oneHighway : country.getHighways()) {

            if (oneHighway != null) {

                for (Car oneCar : oneHighway.getCars()) {

                    if (oneCar != null) {
                        count++;
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }

        }

        System.out.println("Total Cars in Country is " + count + " cars");
    }


    public static void printTotalCarsInHighway(Country country) {
        int count = 0;

        for (Highway oneHighway : country.getHighways()) {

            if (oneHighway != null) {

                for (Car oneCar : oneHighway.getCars()) {

                    if (oneCar != null) {
                        count++;
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }

            System.out.println("Total Cars in " + oneHighway.getName() + "  is " + count + " cars");
            count = 0;
        }

    }

    public static int getTotalCarsInHighway(Highway highway) {
        int count = 0;

            for (Car oneCar : highway.getCars()) {

                if (oneCar != null) {
                    count++;
                }
            }

        return count;
    }

    public static void printAvgSpeedOfCarsInCountry(Country country) {
        double avgByHighway = 0;
        double avgByCountry = 0;
        for (Highway oneHighway : country.getHighways()) {

            if (oneHighway != null) {

                for (Car oneCar : oneHighway.getCars()) {

                    if (oneCar != null) {
                        avgByHighway += oneCar.getSpeed();
                    } else {
                        break;
                    }

                }

            } else {
                break;
            }
            avgByHighway /= oneHighway.getCars().length;
            avgByCountry += avgByHighway;
        }
        avgByCountry /= country.getHighways().length;


        System.out.println("Average speed of Cars in Country is " + (int) avgByCountry + " km/h");

    }

    public static void printFastestCar(Country country) {
        int speed1 = 0;
        int maxSpeed = 0;
        for (Highway oneHighway : country.getHighways()) {

            if (oneHighway != null) {

                for (Car oneCar : oneHighway.getCars()) {

                    if (oneCar != null) {
                        speed1 = oneCar.getSpeed();
                        if (speed1 > maxSpeed) {
                            maxSpeed = speed1;
                        }
                    } else {
                        break;
                    }

                }

            } else {
                break;
            }

        }

        System.out.println("The fastest car is driving at " + maxSpeed + " km/h");

    }

    public static void printHighwayWithMoreCars(Country country) {

        int countOfCars = 0;
        int maxCarsInHighWay = 0;
        Highway busiest = null;
        for (Highway oneHighway : country.getHighways()) {

            if (oneHighway != null) {

                for (Car oneCar : oneHighway.getCars()) {

                    if (oneCar != null) {
                        countOfCars++;

                    } else {
                        if (countOfCars > maxCarsInHighWay) {
                            maxCarsInHighWay = countOfCars;
                            busiest = oneHighway;
                        }
                    }
                }

            } else {
                break;
            }
            countOfCars = 0;
        }
        System.out.println("The Highway : " + busiest.getName() + "  has the most cars. Total cars: " + maxCarsInHighWay + " cars");

    }
}
