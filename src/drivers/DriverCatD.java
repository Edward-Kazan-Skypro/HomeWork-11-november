package drivers;

import cars.Bus;

public class DriverCatD extends Driver <Bus> {

    public DriverCatD(String fullName, int experience, Bus car) {
        super(fullName, "D", experience, car);
    }
}
