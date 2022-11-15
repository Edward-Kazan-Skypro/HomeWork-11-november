package drivers;

import cars.Car;

public abstract class Driver <T extends Car> {

    private String fullName;
    private String drivingLicense = "не указано";
    private int experience;

    public Driver(String fullName, String drivingLicense, int experience) throws RuntimeException {
        if (checkInputString(fullName)) this.fullName = fullName;

        if (drivingLicense.equals("B") || drivingLicense.equals("C") || drivingLicense.equals("D")) {
                this.drivingLicense = drivingLicense;
            }
        if (experience > 0) this.experience = experience;
    }

    public void setDrivingLicense(String drivingLicense) {
        try {
            if (drivingLicense != null){
                this.drivingLicense = drivingLicense;
                if (drivingLicense.equals("B")
                        || drivingLicense.equals("C")
                        || drivingLicense.equals("D")){
                    this.drivingLicense = drivingLicense;
                } else {
                    //Сообщение "Несоответствующий тип прав." не будет появляться,
                    //т.к. использована конструкция try - catch
                    //без этой обертки работа программы прекращается.
                    //А сообщение - подсказка (или пояснение) к типу ошибки.
                    //Если надо, то уберу try - catch.
                    throw new IllegalArgumentException("Несоответствующий тип прав.");
                }
            } else {

                throw new IllegalArgumentException();
            }
        } catch (Exception ex) {
            System.out.println("Необходимо указать тип прав!");
        }
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

    public void refuelCar (T car) {
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
