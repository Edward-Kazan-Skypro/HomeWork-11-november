package drivers;

import cars.Car;

public abstract class Driver {

    private String fullName;
    private String drivingLicense = "не указана";
    private int experience;

    //В конструкторе абстрактного класса не указываю поле "тип лицензии" (drivingLicense).
    //Потому что создание объекта будет в других классах.
    //И не понятно, зачем было создавать три идентичных класса-наследника, отличающихся одним полем,
    //которое (в данном случае) удобнее сразу указать,
    //хотя и это избыточно - например, класс DriverCatB специально создавался для получения объектов,
    //с неизменяемой характеристикой - "категория водительских прав".
    //Если мы создаем объект класса DriverCatB, разве это не подразумевает наличие у созданного объекта
    //характеристики - "водительские права" категории В?
    //Аналогично, создавая объекты классов DriverCatC и DriverCatD, не подразумевается ли у них
    //наличие соответствующего типа прав?
    //Получается, что переменная - "категория водительских прав" чисто декоративная, и можно было отказаться от нее.
    public Driver(String fullName, int experience) {
        if (checkInputString(fullName)) this.fullName = fullName;
        if (experience > 0) this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public int getExperience() {
        return experience;
    }

    public boolean checkInputString(String string) {
        return string.length() > 0 && string != null && !string.isEmpty() && !string.isBlank();
    }

    public void startMoving(Car car) {
        System.out.println("Водитель " + getFullName() +
                " управляет автомобилем " + car.getBrand() + " " + car.getModel() +
                " и будет участвовать в заезде");

    }
    public void stopMoving(Car car) {
        System.out.println("Водитель " + getFullName() +
                    " остановил " + car.getBrand() + " " + car.getModel());
    }

    public void refuelCar(Car car) {
        System.out.println("Водитель " + getFullName() +
                    " заправил автомобиль " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде.");
    }

    @Override
    public String toString () {
        return "Водитель: " + getFullName() +
                ", водительский стаж: " + getExperience() + " лет";
    }
}
