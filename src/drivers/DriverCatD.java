package drivers;

import cars.Bus;

public class DriverCatD extends Driver<Bus> {

    public DriverCatD(String fullName, int experience) {
        super(fullName, "D", experience);
    }

    @Override
    public void startMoving (Bus car) {
        super.startMoving(car);
    }
    public void stopMoving(Bus car) {
        super.stopMoving(car);
    }
    public void refuelCar(Bus car) {
        super.refuelCar(car);
    }

}
