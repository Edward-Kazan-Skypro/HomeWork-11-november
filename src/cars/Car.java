package cars;

public abstract class Car {

    private String brand = "не указано";
    private String model = "не указано";
    private double engineVolume = 0;

    public Car(String brand, String model, double engineVolume) {
        if (checkInputString(brand)) {this.brand = brand;}
        if (checkInputString(model)) {this.model = model;}
        if (engineVolume > 0) this.engineVolume = engineVolume;
    }

    public boolean checkInputString(String string) {
        return string.length() > 0 && string != null && !string.isEmpty() && !string.isBlank();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void start () {
        System.out.println(getBrand() + " " + getModel() + " начал движение.");
    }

    public void stop () {
        System.out.println(getBrand() + " " + getModel() + " остановился.");
    }

    @Override
    public String toString() {
        return  "марка: " + brand +
                ", модель: " + model +
                ", объем двигателя: " + engineVolume + " л.";
    }
}
