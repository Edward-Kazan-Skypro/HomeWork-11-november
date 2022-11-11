package drivers;

import cars.Car;
import cars.Trucks;

public class DriverCatC extends Driver {

    String drivingLicense = "C";
    String errorMessage = "Водитель " + getFullName() +
            " не имеет прав для управления транспортным средством ";

    public DriverCatC(String fullName, int experience) {
        super(fullName, experience);
    }

    @Override
    public void startMoving(Car car) {
        if (car instanceof Trucks) {
            super.startMoving(car);
        } else {
            System.out.println(errorMessage + car.getBrand() + " " + car.getModel());
        }
    }

    public void stopMoving(Car car){
        if (car instanceof Trucks) {
            super.stopMoving(car);
        } else {
            System.out.println(errorMessage + car.getBrand() + " " + car.getModel());
        }
    }

    @Override
    public void refuelCar (Car car){
        if (car instanceof Trucks) {
            super.refuelCar(car);
        } else {
            System.out.println(errorMessage + car.getBrand() + " " + car.getModel());
        }
    }

    @Override
    public String toString () {
        return  super.toString() +  ", права категории: " + drivingLicense + ".";
    }
}
