package mechanics;

import cars.Bus;
import cars.Car;
import cars.PassengerCars;
import cars.Trucks;
import cars.enums.Company;
import java.util.HashSet;

public class Mechanic {

    private String fullName;
    private final Company company;
    private boolean workWithPassengersCars = false;
    private boolean workWithTrucks = false;
    private boolean workWithBus = false;

    private static final HashSet<Mechanic> mechanicsSet = new HashSet<>();


    public Mechanic(String fullName, Company company, boolean workWithPassengersCars, boolean workWithTrucks, boolean workWithBus) {
        this.fullName = fullName;
        this.company = company;
        this.workWithPassengersCars = workWithPassengersCars;
        this.workWithTrucks = workWithTrucks;
        this.workWithBus = workWithBus;
    }

    public static void addMechanicToSet(Mechanic mechanic) {
        mechanicsSet.add(mechanic);
    }

    public static HashSet<Mechanic> getMechanicSet() {
        return mechanicsSet;
    }

    public static void viewAllMechanics(){
        for (Mechanic m: mechanicsSet) {
            System.out.println(m);
        }
    }

    public void doMaintenance(Car car) {
        if (checkCarTypeForWork(car)) {
            System.out.println("Автомобиль " + car.getBrand() + " " + car.getModel() + " прошел техобслуживание.");
        } else {
            System.out.println("Техобслуживание " + car.getBrand() + " " + car.getModel() + " невозможно - механик не имеет соответствующих навыков!");
        }
    }

    public void repairCar(Car car) {
        if (checkCarTypeForWork(car)) {
            System.out.println("Автомобиль " + car.getBrand() + " " + car.getModel() + " отремонтирован.");
        } else {
            System.out.println("Ремонт " + car.getBrand() + " " + car.getModel() + " невозможен - механик не имеет соответствующих навыков!");
        }
    }

    public boolean checkCarTypeForWork(Car car) {
        if (car instanceof PassengerCars && workWithPassengersCars) {
            return true;
        }
        if (car instanceof Trucks && workWithTrucks) {
            return true;
        }
        if (car instanceof Bus && workWithBus) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Механик - имя и фамилия: " + fullName +
                ", место работы (название компании): " + company + "\n" +
                "может работать с пассажирскими автомобилями?: " + workWithPassengersCars + "\n" +
                "может работать с грузовиками?: " + workWithTrucks + "\n" +
                "может работать с автобусами?: " + workWithBus + "\n";
    }
}
