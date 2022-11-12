package drivers;

import cars.PassengerCars;

public class DriverCatB extends Driver <PassengerCars>  {

    public DriverCatB(String fullName, int experience, PassengerCars car) {
        super(fullName, "B", experience, car);
    }


    }
