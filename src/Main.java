import cars.Bus;
import cars.Car;
import cars.PassengerCars;
import cars.Trucks;
import cars.enums.BodyTypePassengersCars;
import cars.enums.CapacityBus;
import cars.enums.CapacityTrucks;
import drivers.Driver;
import drivers.DriverCatB;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        CarsProcedure carsProcedure = new CarsProcedure();

        Trucks truck_1 = new Trucks("MAN", "V-123", 3.5, CapacityTrucks.N1);
        Trucks truck_2 = new Trucks("SCANIA", "Y-55L", 6.5, CapacityTrucks.N2);
        Trucks truck_3 = new Trucks("FAW", "TZ-5", 4.5, CapacityTrucks.N3);
        Trucks truck_4 = new Trucks("Камаз", "CKC-2002", 3.8, CapacityTrucks.N1);
        //Добавляем созданные грузовики в список для последующей их диагностики
        carsProcedure.addCarToTrucksList(truck_1);
        carsProcedure.addCarToTrucksList(truck_2);
        carsProcedure.addCarToTrucksList(truck_3);
        carsProcedure.addCarToTrucksList(truck_4);
        //Диагностика грузовиков
        carsProcedure.startCarDiagnostic(carsProcedure.trucksList);

        System.out.println("----------------------------------------------------------------------------");

        PassengerCars passengerCar_1 = new PassengerCars("BMW", "Z8", 2.8, BodyTypePassengersCars.SEDAN);
        PassengerCars passengerCar_2 = new PassengerCars("Lada", "Granta", 1.8, BodyTypePassengersCars.COUPE);
        PassengerCars passengerCar_3 = new PassengerCars("Audi", "A8", 3.1, BodyTypePassengersCars.VAN);
        PassengerCars passengerCar_4 = new PassengerCars("SAAB", "9-5", 2.7, BodyTypePassengersCars.CROSSOVER);
        //Добавляем созданные легковые автомобили в список для последующей их диагностики
        carsProcedure.addCarToPassengerCarsList(passengerCar_1);
        carsProcedure.addCarToPassengerCarsList(passengerCar_2);
        carsProcedure.addCarToPassengerCarsList(passengerCar_3);
        carsProcedure.addCarToPassengerCarsList(passengerCar_4);
        //Диагностика легковых автомобилей
        carsProcedure.startCarDiagnostic(carsProcedure.passengerCarsList);

        System.out.println("----------------------------------------------------------------------------");

        Bus bus_1 = new Bus("Neoplan", "N980 Galaxy-Lounge", 3.7, CapacityBus.AVERAGE);
        Bus bus_2 = new Bus("HIGER", "X-999", 3.1, CapacityBus.SMALL);
        Bus bus_3 = new Bus("HYUNDAI", "A-555", 3.3, CapacityBus.SPECIAL_BIG);
        Bus bus_4 = new Bus("Ikarus", "Z-5", 4.2, CapacityBus.SPECIAL_SMALL);
        //Добавляем созданные автобусы в список для последующей их диагностики
        carsProcedure.addCarToBusList(bus_1);
        carsProcedure.addCarToBusList(bus_2);
        carsProcedure.addCarToBusList(bus_3);
        carsProcedure.addCarToBusList(bus_4);
        //Диагностика автобусов
        carsProcedure.startCarDiagnostic(carsProcedure.busList);

        System.out.println("----------------------------------------------------------------------------");

        //Создадим правильного водителя с правами категории В
        Driver<PassengerCars> driver_1 = new DriverCatB("Иванов Иван Иванович", 15);
        driver_1.setDrivingLicense("B");
        System.out.println(driver_1);
        driver_1.startMoving(passengerCar_1);

        //Создадим неправильного водителя с правами неверного типа
        Driver<PassengerCars> driver_2 = new DriverCatB("Петров Петр Петрович", 10);
        driver_2.setDrivingLicense("права для управления космическим кораблем");
        System.out.println(driver_2);
        //Когда вручную указываем тип водительских прав, то хорошо бы добавлять проверку
        //на соответствие типу прав и возможности пользования автомобилем (startMoving(), stopMoving() и т.д.).
        //Но это раздует компактные классы DriverCatB, DriverCatC и DriverCatD
        //и, скорее всего сделает их ненужными...
        driver_2.startMoving(passengerCar_1);
    }

    //Внутренний класс-утилита для формирования списков транспортных средств и работы со списками (массовая диагностика)
    public static class CarsProcedure {

        private final ArrayList<Car> passengerCarsList = new ArrayList<>();
        private final ArrayList<Car> trucksList = new ArrayList<>();
        private final ArrayList<Car> busList = new ArrayList<>();

        public CarsProcedure() {
        }

        public void addCarToPassengerCarsList(PassengerCars car) {
            passengerCarsList.add(car);
        }

        public void addCarToTrucksList(Trucks car) {
            trucksList.add(car);
        }

        public void addCarToBusList(Bus car) {
            busList.add(car);
        }

        public void viewCarList(ArrayList<Car> list) {
            for (Car car : list) {
                System.out.println(car);
            }
        }

        public void startCarDiagnostic(ArrayList<Car> list) {
            if (list != busList) {
                for (Car car : list) {
                    try {
                        if (car.diagnosticCar()) {
                            System.out.println(car.getBrand() + " " + car.getModel() + " прошел диагностику успешно.");
                        } else {
                            System.out.println(car.getBrand() + " " + car.getModel() + "  не прошел диагностику.");
                            throw new RuntimeException();
                        }
                    } catch (RuntimeException message) {
                        System.out.println(car.getBrand() + " " + car.getModel() + "  пройдите повторную диагностику!");
                    }
                }
            } else {
                System.out.println("Автобусы диагностику не проходят.");
            }
        }
    }
}