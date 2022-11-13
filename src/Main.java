import cars.Bus;
import cars.PassengerCars;
import cars.Trucks;
import drivers.Driver;
import drivers.DriverCatB;
import drivers.DriverCatD;

public class Main {
    public static void main(String[] args) {

        Trucks truck_1 = new Trucks("MAN", "V-123", 3.5);
        Trucks truck_2 = new Trucks("Камаз", "X-999", 2.5);
        Trucks truck_3 = new Trucks("SCANIA", "Y-55L", 6.5);
        Trucks truck_4 = new Trucks("FAW", "TZ-5", 4.5);
        //Посмотрим информацию по созданному грузовику
        System.out.println(truck_1);
        //Запустим пару методов этого класса
        truck_1.start();
        truck_1.stop();
        truck_1.pitStop();
        truck_1.bestTime();
        truck_1.maxSpeed();
        System.out.println("----------------------------------------------------------------------------");

        PassengerCars passengerCar_1 = new PassengerCars("BMW", "Z8", 2.8);
        PassengerCars passengerCar_2 = new PassengerCars("Lada", "Granta", 1.8);
        PassengerCars passengerCar_3 = new PassengerCars("Audi", "A8", 3.1);
        PassengerCars passengerCar_4 = new PassengerCars("SAAB", "9-5", 2.7);
        //Посмотрим информацию по созданному легковому автомобилю
        System.out.println(passengerCar_1);
        //Запустим пару методов этого класса
        passengerCar_1.start();
        passengerCar_1.stop();
        passengerCar_1.pitStop();
        passengerCar_1.bestTime();
        passengerCar_1.maxSpeed();
        System.out.println("----------------------------------------------------------------------------");

        Bus bus_1 = new Bus("Neoplan", "N980 Galaxy-Lounge", 3.7);
        Bus bus_2 = new Bus("HIGER", "X-999", 3.1);
        Bus bus_3 = new Bus("HYUNDAI", "A-555", 3.3);
        Bus bus_4 = new Bus("Ikarus", "Z-5", 4.2);
        //Посмотрим информацию по созданному автобусу
        System.out.println(bus_1);
        //Запустим пару методов этого класса
        bus_1.start();
        bus_1.stop();
        bus_1.pitStop();
        bus_1.bestTime();
        bus_1.maxSpeed();
        System.out.println("----------------------------------------------------------------------------");

        //Создадим водителя с правами категории В
        Driver<PassengerCars> driver_1 = new DriverCatB("Иванов Иван Иванович", 15);
        System.out.println(driver_1);
        //Посадим водителя за руль всех легковых автомобилей
        driver_1.startMoving(passengerCar_2);
        driver_1.startMoving(passengerCar_1);
        driver_1.startMoving(passengerCar_3);
        driver_1.startMoving(passengerCar_4);
        //Проверим работу методов
        driver_1.stopMoving(passengerCar_4);
        driver_1.refuelCar(passengerCar_4);
        driver_1.message(passengerCar_4);
        System.out.println();

        Driver<Bus> driver_2 = new DriverCatD("Петров Петр Петрович", 6);
        System.out.println(driver_2);
        driver_2.startMoving(bus_1);
        driver_2.message(bus_1);
        System.out.println("----------------------------------------------------------------------------");
    }
}