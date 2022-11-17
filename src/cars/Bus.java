package cars;

import cars.enums.CapacityBus;

public class Bus extends Car implements race.Competing {

    private final CapacityBus bodyType;

    public Bus(String brand, String model, double engineVolume, CapacityBus inputBodyType) {
        super(brand, model, engineVolume);
        bodyType = inputBodyType;
    }

    public int getMIN_LIMIT_MECHANIC() {
        return 2;
    }

    public CapacityBus getBodyType() {
        return bodyType;
    }

    public void printBodyType () {
        if (this.bodyType == null) {
            System.out.println("Данных по авто недостаточно.");
        } else {
            System.out.println("Вместимость автобуса " + getBrand() + " " + getModel() + ":"+ getBodyType());
        }
    }

    @Override
    public void start() {
        System.out.print("Автобус ");
        super.stop();
    }

    @Override
    public void stop() {
        System.out.print("Автобус ");
        super.stop();
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " заехал на пит-стоп.");
    }

    @Override
    public void bestTime() {
        System.out.print("Автобус " + getBrand() + " " + getModel() +" показал лучшее время за круг: ");
        System.out.println((int) (Math.random() * 100 + 1) + " минут.");
    }

    @Override
    public void maxSpeed() {
        System.out.print("Автобус " + getBrand() + " " + getModel() +" достиг максимальной скорости в ");
        System.out.println((int) (Math.random() * 100 + 1) + " км/час.");
    }

    public boolean diagnosticCar() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " диагностику не проходит.");
        return true;
    }

    @Override
    public String toString() {
        return "Автобус - " + super.toString();
    }
}
