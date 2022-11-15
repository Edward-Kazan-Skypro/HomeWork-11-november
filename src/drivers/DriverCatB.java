package drivers;

import cars.PassengerCars;

public class DriverCatB extends Driver<PassengerCars> {

    public DriverCatB(String fullName, int experience) {
        super(fullName, "B",experience);
    }

    public void setDrivingLicense(String drivingLicense) {
        super.setDrivingLicense(drivingLicense);
    }

    public void startMoving(PassengerCars car) {
        super.startMoving(car);
    }

    public void stopMoving(PassengerCars car) {
        super.stopMoving(car);
    }

    public void refuelCar (PassengerCars car) {
        super.refuelCar(car);
    }

}
