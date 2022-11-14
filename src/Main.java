import cars.Bus;
import cars.PassengerCars;
import cars.Trucks;
import cars.enums.BodyTypePassengersCars;
import cars.enums.CapacityBus;
import cars.enums.CapacityTrucks;

public class Main {
    public static void main(String[] args) {

        Trucks truck_1 = new Trucks("MAN", "V-123", 3.5, CapacityTrucks.N1);
        Trucks truck_3 = new Trucks("SCANIA", "Y-55L", 6.5, CapacityTrucks.N2);
        Trucks truck_4 = new Trucks("FAW", "TZ-5", 4.5, CapacityTrucks.N3);
        truck_1.printBodyType();
        System.out.println("----------------------------------------------------------------------------");

        PassengerCars passengerCar_1 = new PassengerCars("BMW", "Z8", 2.8, BodyTypePassengersCars.SEDAN);
        PassengerCars passengerCar_2 = new PassengerCars("Lada", "Granta", 1.8, BodyTypePassengersCars.COUPE);
        PassengerCars passengerCar_3 = new PassengerCars("Audi", "A8", 3.1, BodyTypePassengersCars.VAN);
        PassengerCars passengerCar_4 = new PassengerCars("SAAB", "9-5", 2.7, BodyTypePassengersCars.CROSSOVER);
        passengerCar_1.printBodyType();
        System.out.println("----------------------------------------------------------------------------");

        Bus bus_1 = new Bus("Neoplan", "N980 Galaxy-Lounge", 3.7, CapacityBus.AVERAGE);
        Bus bus_2 = new Bus("HIGER", "X-999", 3.1, CapacityBus.SMALL);
        Bus bus_3 = new Bus("HYUNDAI", "A-555", 3.3, CapacityBus.SPECIAL_BIG);
        Bus bus_4 = new Bus("Ikarus", "Z-5", 4.2, CapacityBus.SPECIAL_SMALL);
        bus_4.printBodyType();
        System.out.println("----------------------------------------------------------------------------");

        //Создадим водителя с правами категории В
        //Driver<PassengerCars> driver_1 = new DriverCatB("Иванов Иван Иванович", 15);
        //System.out.println(driver_1);
        //System.out.println("----------------------------------------------------------------------------");
    }
}