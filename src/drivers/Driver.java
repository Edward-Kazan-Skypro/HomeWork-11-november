package drivers;

import cars.Car;

public abstract class Driver <T extends Car> {

    private String fullName;
    private String drivingLicense;
    private int experience;

    private T car;


    public Driver(String fullName, String drivingLicense, int experience) {
        if (checkInputString(fullName)) this.fullName = fullName;
        if (drivingLicense.equals("B") || drivingLicense.equals("C") || drivingLicense.equals("D")) {
            this.drivingLicense = drivingLicense;
        }
        if (experience > 0) this.experience = experience;

    }

    public String getFullName() {
        return fullName;
    }

    public int getExperience() {
        return experience;
    }

    public String getDrivingLicense() {return drivingLicense;}

    public boolean checkInputString(String string) {
        return string.length() > 0 && string != null && !string.isEmpty() && !string.isBlank();
    }

    public void startMoving(T car) {
        System.out.println("Водитель " + getFullName() +
                " начал поездку на  " + car.getBrand() + " " + car.getModel());

    }
    public void stopMoving(T car) {
        System.out.println("Водитель " + getFullName() +
                    " остановил " + car.getBrand() + " " + car.getModel());
    }

    public void refuelCar(T car) {
        System.out.println("Водитель " + getFullName() +
                    " заправил автомобиль " + car.getBrand() + " " + car.getModel());
    }

    public void message (T car) {
        System.out.println("Водитель " + getFullName() +
                " управляет автомобилем " + car.getBrand() + " " + car.getModel() +
                " и будет участвовать в заезде");
    }

    @Override
    public String toString () {
        return "Водитель: " + getFullName() +
                ", водительский стаж: " + getExperience() + " лет" +
                ", водительские права категории: " + getDrivingLicense();
    }
}
