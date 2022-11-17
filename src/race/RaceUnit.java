package race;

import cars.Bus;
import cars.Car;
import cars.PassengerCars;
import cars.Trucks;
import cars.enums.Sponsors;
import drivers.Driver;
import mechanics.Mechanic;

import java.util.ArrayList;
import java.util.HashSet;

//Класс для создания объекта - участник заезда (гонок)
//Участник гонок - это машина + водитель и спонсор
//Машина создается отдельно, водитель тоже отдельно.
//Но в этом классе они соединяются в новый объект - участник гонок.
public class RaceUnit {

    Car car;
    Bus bus;
    Trucks trucks;
    PassengerCars passengerCars;

    Driver driver;
    private final Sponsors sponsor;

    HashSet <Sponsors> sponsorsSet = new HashSet<>();

    Mechanic mechanic;

    HashSet <Mechanic> mechanicsSet = new HashSet<>();

    public RaceUnit(Car car, Driver driver, Sponsors sponsor) {
        this.sponsor = sponsor;
        if (driver.isFreeForRace()) {
            this.car = car;
            this.driver = driver;
            driver.setFreeForRace(false);
        } else {
            System.out.println("Участник гонок не создан - водитель уже участвует в гонках!");
        }
    }

    public void addMechanicToRaceUnit (Mechanic mechanic, Car car){
        if (mechanic.checkCarTypeForWork(car)) mechanicsSet.add(mechanic);
    }

    public void addSponsorToRaceUnit (Sponsors sponsor) {
        sponsorsSet.add(sponsor);
    }

    public Car getCar() {
        return car;
    }

    public Driver getDriver() {
        return driver;
    }

    public void checkRaceUnitReadyToRace (){
        System.out.print("Участник заезда:\n" +
                "машина: " + car.getBrand() + " " + car.getModel() +
                ", водитель : " + driver.getFullName());
        if (getCar().getMIN_LIMIT_MECHANIC() < mechanicsSet.size()) {
            System.out.println(" не готов к заезду - мало механиков для обслуживания автомобиля!");
        } else {
           System.out.println(" готов к гонкам!");
        }
    }

    @Override
    public String toString() {
        if (getDriver() != null && getCar() != null) {
            return "Участник заезда:\n" +
                    "машина: " + car.getBrand() + " " + car.getModel() +
                    ", водитель : " + driver.getFullName() +
                    ", спонсор(-ы): " + sponsorsSet + "\n" +
                    "команда механиков (имеющих соответствующие умения):\n" + mechanicsSet;
        } else {
            return "Сведения по участнику заезда отсутствуют.";
        }
    }
}
