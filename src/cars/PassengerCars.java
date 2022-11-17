package cars;

import cars.enums.BodyTypePassengersCars;

public class PassengerCars extends Car implements race.Competing {

    private final BodyTypePassengersCars bodyType;

    public PassengerCars(String brand, String model, double engineVolume, BodyTypePassengersCars inputBodyType) {
        super(brand, model, engineVolume);
        bodyType = inputBodyType;
    }

    public int getMIN_LIMIT_MECHANIC() {
        return 1;
    }

    public BodyTypePassengersCars getBodyType() {
        return bodyType;
    }

    public void printBodyType() {
        if (this.bodyType == null) {
            System.out.println("Данных по авто недостаточно.");
        } else {
            System.out.println("Тип кузова легкового автомобиля " + getBrand() + " " + getModel() + ": " + this.bodyType);
        }
    }

    @Override
    public void start() {
        System.out.print("Легковой автомобиль ");
        super.start();
    }

    @Override
    public void stop() {
        System.out.print("Легковой автомобиль ");
        super.stop();
    }

    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " заехал на пит-стоп.");
    }

    @Override
    public void bestTime() {
        System.out.print("Легковой автомобиль " + getBrand() + " " + getModel() + " показал лучшее время за круг: ");
        System.out.println((int) (Math.random() * 100 + 1) + " минут.");
    }

    @Override
    public void maxSpeed() {
        System.out.print("Легковой автомобиль " + getBrand() + " " + getModel() + " достиг максимальной скорости в ");
        System.out.println((int) (Math.random() * 100 + 1) + " км/час.");
    }

    public boolean diagnosticCar() {
        return Math.random() > 0.5;
    }

    @Override
    public String toString() {
        return "Легковой автомобиль - " + super.toString() + ", тип кузова:" + this.getBodyType();
    }
}
