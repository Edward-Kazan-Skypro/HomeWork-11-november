package cars;

import cars.enums.CapacityTrucks;


public class Trucks extends Car implements race.Competing {

    private final CapacityTrucks bodyType;

    public Trucks(String brand, String model, double engineVolume, CapacityTrucks inputBodyType) {
        super(brand, model, engineVolume);
        bodyType = inputBodyType;
    }

    public CapacityTrucks getBodyType () {
        return bodyType;
    }
    public void printBodyType() {
        if (this.bodyType == null) {
            System.out.println("Данных по авто недостаточно.");
        } else {
            System.out.println("Грузоподъемность грузовика " + getBrand() + " " + getModel() + ":" + getBodyType());
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
    public boolean diagnosticCar() {
        return Math.random() > 0.5;
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
