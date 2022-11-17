package drivers;

import cars.Trucks;

public class DriverCatC extends Driver<Trucks> {

    public DriverCatC(String fullName, int experience) {
        super(fullName, "C", experience);
    }

    @Override
    public void startMoving(Trucks car) {
        super.startMoving(car);
    }
    public void stopMoving(Trucks car) {
        super.stopMoving(car);
    }

    public void refuelCar (Trucks car) {
        super.refuelCar(car);
    }

}
