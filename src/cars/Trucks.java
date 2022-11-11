package cars;

public class Trucks extends Car implements race.Competing {

    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " показал лучшее время за круг.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " достиг максимальной скорости.");
    }

    @Override
    public String toString() {
        return "Грузовик - " + super.toString();
    }
}
