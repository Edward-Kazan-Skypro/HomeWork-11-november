package drivers;

import cars.Car;
import cars.PassengerCars;

public class DriverCatB extends Driver {

    private String drivingLicense = "B";
    String errorMessage = "Водитель " + getFullName() +
            " не имеет прав для управления транспортным средством ";

    public DriverCatB(String fullName, int experience) {
        super(fullName, experience);
    }

    @Override
    public void startMoving(Car car) {
        if (car instanceof PassengerCars) {
            super.startMoving(car);
        } else {
            System.out.println(errorMessage + car.getBrand() + " " + car.getModel());
        }
    }

        public void stopMoving(Car car){
            if (car instanceof PassengerCars) {
                super.stopMoving(car);
            } else {
                System.out.println(errorMessage + car.getBrand() + " " + car.getModel());
            }
        }

        @Override
        public void refuelCar (Car car){
            if (car instanceof PassengerCars) {
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
