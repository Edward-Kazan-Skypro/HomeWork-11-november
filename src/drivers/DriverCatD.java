package drivers;

import cars.Car;
import cars.Bus;

public class DriverCatD extends Driver {

    String drivingLicense = "D";
    String errorMessage = "Водитель " + getFullName() +
            " не имеет прав для управления транспортным средством ";

    public DriverCatD(String fullName, int experience) {
        super(fullName, experience);
    }

    @Override
    public void startMoving(Car car) {
        if (car instanceof Bus) {
            super.startMoving(car);
        } else {
            System.out.println(errorMessage + car.getBrand() + " " + car.getModel());
        }
    }

    public void stopMoving(Car car){
        if (car instanceof Bus) {
            super.stopMoving(car);
        } else {
            System.out.println(errorMessage + car.getBrand() + " " + car.getModel());
        }
    }

    @Override
    public void refuelCar (Car car){
        if (car instanceof Bus) {
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
