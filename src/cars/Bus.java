package cars;

public class Bus extends Car implements race.Competing {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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

    @Override
    public String toString() {
        return "Автобус - " + super.toString();
    }
}
