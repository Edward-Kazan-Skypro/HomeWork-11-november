package cars;

import cars.enums.CapacityTrucks;

public class Trucks extends Car implements race.Competing {

    CapacityTrucks bodyType;
    public Trucks(String brand, String model, double engineVolume, CapacityTrucks inputBodyType) {
        super(brand, model, engineVolume);
        bodyType = inputBodyType;
    }

    public void printBodyType() {
        if (this.bodyType == null) {
            System.out.println("Данных по авто недостаточно.");
        } else {
            System.out.println("Грузоподъемность грузовика " + getBrand() + " " + getModel() + ": "+ this.bodyType);
        }
    }

    @Override
    public void start() {
        System.out.print("Грузовой автомобиль ");
        super.start();
    }

    @Override
    public void stop() {
        System.out.print("Грузовой автомобиль ");
        super.stop();
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль "+ getBrand() + " " + getModel() + " заехал на пит-стоп.");
    }

    @Override
    public void bestTime() {
        System.out.print("Грузовой автомобиль " + getBrand() + " " + getModel() + " показал лучшее время за круг: ");
        System.out.println((int) (Math.random() * 100 + 1) + " минут.");
    }

    @Override
    public void maxSpeed() {
        System.out.print("Грузовой автомобиль " + getBrand() + " " + getModel() + " достиг максимальной скорости в ");
        System.out.println((int) (Math.random() * 100 + 1) + " км/час.");
    }

    @Override
    public String toString() {
        return "Грузовик - " + super.toString();
    }
}
