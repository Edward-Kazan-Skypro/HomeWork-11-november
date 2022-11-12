package drivers;

import cars.Trucks;

public class DriverCatC extends Driver <Trucks> {

    public DriverCatC(String fullName, int experience, Trucks car) {
        super(fullName, "C", experience, car);
    }
}
